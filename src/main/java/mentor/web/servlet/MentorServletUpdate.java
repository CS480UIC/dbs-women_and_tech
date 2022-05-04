package mentor.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mentor.dao.MentorDao;
import mentor.domain.Mentor;
//import entity1.service.Entity1Service;

/**
 * Servlet implementation class UserServlet
 */

public class MentorServletUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MentorServletUpdate() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String method = request.getParameter("method");
		MentorDao mentordao = new MentorDao();
		Mentor mentor = null;
		
		if(method.equals("search"))
		{
			try {
				mentor = mentordao.findByMember_id(Integer.valueOf(request.getParameter("member_id")));
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
		
//			Entity1Service entity1service = new Entity1Service();		
			if(mentor.getMember_id()!=null){

						System.out.println(mentor);
						request.setAttribute("mentor", mentor);
						request.getRequestDispatcher("/jsps/mentor/mentor_update_output.jsp").forward(request, response);
					
				}
				else{
					
				request.setAttribute("msg", "Mentor not found");
				request.getRequestDispatcher("/jsps/mentor/mentor_read_output.jsp").forward(request, response);
			}
		}
		else if(method.equals("update"))
		{
			Map<String,String[]> paramMap = request.getParameterMap();
			Mentor form = new Mentor();
			List<String> info = new ArrayList<String>();

			for(String name : paramMap.keySet()) {
				
				String[] values = paramMap.get(name);
				info.add(values[0]);
			}
			form.setMember_id(Integer.valueOf(request.getParameter("member_id")));
//			System.out.println("1");
			form.setYears_in_industry(Integer.valueOf(info.get(2)));
			form.setRole_in_industry(info.get(3));
//			System.out.println("2");
			form.setYears_of_mentoring(Integer.valueOf(info.get(4)));	

			try {
				mentordao.update(form);

			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
			request.setAttribute("msg", "Mentor Updated");
			request.getRequestDispatcher("/jsps/mentor/mentor_read_output.jsp").forward(request, response);
		}
	}
}




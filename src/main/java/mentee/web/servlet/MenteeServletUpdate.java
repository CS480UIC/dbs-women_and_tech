package mentee.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mentee.dao.MenteeDao;
import mentee.domain.Mentee;
//import entity1.service.Entity1Service;

/**
 * Servlet implementation class UserServlet
 */

public class MenteeServletUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MenteeServletUpdate() {
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
		MenteeDao menteedao = new MenteeDao();
		Mentee mentee = null;
		
		if(method.equals("search"))
		{
			try {
				mentee = menteedao.findBymember_id(Integer.valueOf(request.getParameter("member_id")));
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
		
//			Entity1Service entity1service = new Entity1Service();		
			if(mentee.getMember_id()!=null){

						System.out.println(mentee);
						request.setAttribute("mentee", mentee);
						request.getRequestDispatcher("/jsps/mentee/mentee_update_output.jsp").forward(request, response);
					
				}
				else{
					
				request.setAttribute("msg", "mentee not found");
				request.getRequestDispatcher("/jsps/mentee/mentee_read_output.jsp").forward(request, response);
			}
		}
		else if(method.equals("update"))
		{
			Map<String,String[]> paramMap = request.getParameterMap();
			Mentee form = new Mentee();
			List<String> info = new ArrayList<String>();

			for(String name : paramMap.keySet()) {
				
				String[] values = paramMap.get(name);
				info.add(values[0]);
			}
			form.setMember_id((Integer.valueOf(request.getParameter("member_id"))));
			form.setField_of_interest(info.get(2));
			form.setMajor(info.get(3));		
			form.setSchool_name(info.get(4));	

			try {
				menteedao.update(form);

			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
			request.setAttribute("msg", "Mentee Updated");
			request.getRequestDispatcher("/jsps/mentee/mentee_read_output.jsp").forward(request, response);
		}
	}
}




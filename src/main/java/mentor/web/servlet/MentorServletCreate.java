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

import mentor.domain.Mentor;
import mentor.service.MentorException;
import mentor.service.MentorService;


/**
 * Servlet implementation class UserServlet
 */

public class MentorServletCreate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MentorServletCreate() {
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
		MentorService entity1service = new MentorService();
		Map<String,String[]> paramMap = request.getParameterMap();
		Mentor form = new Mentor();
		List<String> info = new ArrayList<String>();
		for(String name : paramMap.keySet()) {
			
			String[] values = paramMap.get(name);
			info.add(values[0]);

		}
		form.setMember_id(Integer.valueOf(info.get(0)));
//		System.out.println("1");
		form.setYears_in_industry(Integer.valueOf(info.get(1)));
		form.setRole_in_industry(info.get(2));
//		System.out.println("2");
		form.setYears_of_mentoring(Integer.valueOf(info.get(3)));		
//		System.out.println("3");
		
		
		try {
			entity1service.create(form);
			response.sendRedirect( request.getContextPath() + "/jsps/main.jsp");
			
		} catch (ClassNotFoundException | MentorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}

package scholarship.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import scholarship.domain.Scholarship;
import scholarship.service.ScholarshipException;
import scholarship.service.ScholarshipService;


/**
 * Servlet implementation class UserServlet
 */

public class ScholarshipServletCreate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ScholarshipServletCreate() {
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
		ScholarshipService scholarshipservice = new ScholarshipService();
		Map<String,String[]> paramMap = request.getParameterMap();
		Scholarship form = new Scholarship();
		List<String> info = new ArrayList<String>();
		System.out.println(form);
		for(String name : paramMap.keySet()) {
			
			String[] values = paramMap.get(name);
			info.add(values[0]);
//			System.out.println(name + ": " + Arrays.toString(values));
//			System.out.println(info.add(values[0]));

		}


		form.setScholarship_id(Integer.parseInt(info.get(0)));
		form.setScholarship_name(info.get(1));
		form.setScholarship_amount(Integer.parseInt(info.get(2)));
		form.setScholarship_description(info.get(3));
		form.setApplication_deadline(java.sql.Date.valueOf(info.get(4)));
		form.setApplication_released(java.sql.Date.valueOf(info.get(5)));
		form.setRequirements(info.get(6));
		
		
		try {
//			System.out.println("3");
			scholarshipservice.create(form);
			response.sendRedirect( request.getContextPath() + "/jsps/main.jsp");
			
		} catch (ClassNotFoundException | ScholarshipException e) {
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

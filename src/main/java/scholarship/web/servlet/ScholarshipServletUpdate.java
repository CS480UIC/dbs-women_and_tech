package scholarship.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import scholarship.dao.ScholarshipDao;
import scholarship.domain.Scholarship;
import scholarship.service.ScholarshipService;

/**
 * Servlet implementation class UserServlet
 */

public class ScholarshipServletUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ScholarshipServletUpdate() {
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
		ScholarshipDao scholarshipdao = new ScholarshipDao();
		Scholarship scholarship = null;
		
		if(method.equals("search"))
		{
			try {
				scholarship = ScholarshipDao.findByScholarshipID(Integer.parseInt(request.getParameter("scholarship_id")));
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
		
//			Entity1Service entity1service = new Entity1Service();		
			if(scholarship.getScholarship_id()!=null){
				System.out.println("11");

				System.out.println(scholarship);
				request.setAttribute("scholarship", scholarship);
				request.getRequestDispatcher("/jsps/scholarship/scholarship_update_output.jsp").forward(request, response);
					
			}else{
					
				request.setAttribute("msg", "Scholarship not found");
				request.getRequestDispatcher("/jsps/scholarship/scholarship_read_output.jsp").forward(request, response);
			}
		}
		else if(method.equals("update"))
		{
//			Map<String,String[]> paramMap = request.getParameterMap();
			Scholarship form = new Scholarship();
//			List<String> info = new ArrayList<String>();

//			for(String name : paramMap.keySet()) {
//				
//				String[] values = paramMap.get(name);
//				info.add(values[0]);
//				System.out.println(name + ": " + Arrays.toString(values));
//			}
			
			
			form.setScholarship_id(Integer.parseInt(request.getParameter("scholarship_id")));
			form.setScholarship_name(request.getParameter("scholarship_name"));
			form.setScholarship_amount(Integer.parseInt(request.getParameter("scholarship_amount")));
			form.setScholarship_description(request.getParameter("scholarship_description"));
			form.setApplication_deadline(java.sql.Date.valueOf(request.getParameter("application_deadline")));
			form.setApplication_released(java.sql.Date.valueOf(request.getParameter("application_released")));
			form.setRequirements(request.getParameter("requirements"));
			
			try {
				scholarshipdao.update(form);

			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
			request.setAttribute("msg", "Scholarship Updated");
			request.getRequestDispatcher("/jsps/scholarship/scholarship_read_output.jsp").forward(request, response);
		}
	}
}




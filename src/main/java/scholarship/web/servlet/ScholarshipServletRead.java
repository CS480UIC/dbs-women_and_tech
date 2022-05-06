package scholarship.web.servlet;

import java.io.IOException;


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

public class ScholarshipServletRead extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ScholarshipServletRead() {
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
		Scholarship scholarship = null;
//		ScholarshipDao scholarshipDao = new ScholarshipDao();
		
		try {
			scholarship = ScholarshipDao.findByScholarshipID(Integer.parseInt(request.getParameter("scholarship_id")));
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		}
		
		if(scholarship.getScholarship_id()!=null){
				System.out.println(scholarship);
				request.setAttribute("scholarship", scholarship);
				request.getRequestDispatcher("/jsps/scholarship/scholarship_read_output.jsp").forward(request, response);
				
		} else {
			request.setAttribute("msg", "Scholarship not found");
			request.getRequestDispatcher("/jsps/scholarship/scholarship_read_output.jsp").forward(request, response);
		}
	}
}




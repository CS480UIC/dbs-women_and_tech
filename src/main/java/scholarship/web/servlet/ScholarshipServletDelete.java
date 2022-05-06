package scholarship.web.servlet;

import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;

//import javax.jws.WebService;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import scholarship.dao.ScholarshipDao;
import scholarship.domain.Scholarship;
//import entity1.service.Entity1Exception;
//import entity1.service.Entity1Service;
/**
 * Servlet implementation class UserServlet
 */

public class ScholarshipServletDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ScholarshipServletDelete() {
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
//				entity1dao to Entity1Dao
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
						System.out.println(scholarship);
						request.setAttribute("scholarship", scholarship);
						request.getRequestDispatcher("/jsps/scholarship/scholarship_delete_output.jsp").forward(request, response);
					
			}else{
				request.setAttribute("msg", "Scholarship not found");
				request.getRequestDispatcher("/jsps/scholarship/scholarship_read_output.jsp").forward(request, response);
			}
		}
		else if(method.equals("delete"))
		{	
			try {
				scholarshipdao.delete(request.getParameter("scholarship_id"));
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
			request.setAttribute("msg", "Scholarship Deleted");
			request.getRequestDispatcher("/jsps/scholarship/scholarship_read_output.jsp").forward(request, response);
		}
	}
}




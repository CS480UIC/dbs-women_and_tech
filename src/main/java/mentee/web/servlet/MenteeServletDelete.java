package mentee.web.servlet;

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

import mentee.dao.MenteeDao;
import mentee.domain.Mentee;
//import entity1.service.Entity1Exception;
//import entity1.service.Entity1Service;
/**
 * Servlet implementation class UserServlet
 */

public class MenteeServletDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MenteeServletDelete() {
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
//				entity1dao to Entity1Dao
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
		
						request.setAttribute("mentee", mentee);
						request.getRequestDispatcher("/jsps/mentee/mentee_delete_output.jsp").forward(request, response);
					
				}
				else{
				request.setAttribute("msg", "Mentee not found");
				request.getRequestDispatcher("/jsps/mentee/mentee_read_output.jsp").forward(request, response);
			}
		}
		else if(method.equals("delete"))
		{	
			try {
				menteedao.delete(Integer.valueOf( request.getParameter("member_id")));
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
			request.setAttribute("msg", "Mentee Deleted");
			request.getRequestDispatcher("/jsps/mentee/mentee_read_output.jsp").forward(request, response);
		}
	}
}




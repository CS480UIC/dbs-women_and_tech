package mentee.web.servlet;

import java.io.IOException;


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

public class MenteeServletRead extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MenteeServletRead() {
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
		Mentee mentee = null;
		MenteeDao menteeDao = new MenteeDao();
		try {
			mentee = MenteeDao.findBymember_id(Integer.valueOf(request.getParameter("member_id")));
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		}
		
		if(mentee.getMember_id()!=null){
//					System.out.println(mentee);
					request.setAttribute("mentee", mentee);
					request.getRequestDispatcher("/jsps/mentee/mentee_read_output.jsp").forward(request, response);
				
			}
			else{
			request.setAttribute("msg", "Mentee not found");
			request.getRequestDispatcher("/jsps/mentee/mentee_read_output.jsp").forward(request, response);
		}
	}
}




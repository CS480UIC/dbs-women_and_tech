package mentor.web.servlet;

import java.io.IOException;


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

public class MentorServletRead extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MentorServletRead() {
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
		Mentor mentor = null;
		MentorDao mentorDao = new MentorDao();
		
		try {
			mentor = MentorDao.findByMember_id(Integer.valueOf(request.getParameter("member_id")));
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		}
		
		if(mentor.getMember_id()!=null){
					System.out.println(mentor);
					request.setAttribute("mentor", mentor);
					request.getRequestDispatcher("/jsps/mentor/mentor_read_output.jsp").forward(request, response);
				
			}
			else{
			request.setAttribute("msg", "Mentor not found");
			request.getRequestDispatcher("/jsps/mentor/mentor_read_output.jsp").forward(request, response);
		}
	}
}




package special_interest_group.web.servlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import special_interest_group.dao.Special_Interest_GroupDao;
import special_interest_group.domain.Special_Interest_Group;
import special_interest_group.service.Special_Interest_GroupService;


/**
 * Servlet implementation class UserServlet
 */

public class Special_Interest_GroupServletRead extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Special_Interest_GroupServletRead() {
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
		Special_Interest_Group special_interest_group = null;
//		Special_Interest_GroupDao sigDao = new Special_Interest_GroupDao();
		try {
			
			special_interest_group = Special_Interest_GroupDao.findByGroupID(Integer.valueOf(request.getParameter("group_id")));
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		}
		
		if(special_interest_group.getGroup_name()!=null){
			System.out.println(special_interest_group);
			request.setAttribute("special_interest_group", special_interest_group);
			request.getRequestDispatcher("/jsps/special_interest_group/special_interest_group_read_output.jsp").forward(request, response);
				
		}else{
			request.setAttribute("msg", "Entity not found");
			request.getRequestDispatcher("/jsps/special_interest_group/special_interest_group_read_output.jsp").forward(request, response);
		}
	}
}




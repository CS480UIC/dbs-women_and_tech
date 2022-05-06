package special_interest_group.web.servlet;

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

import special_interest_group.dao.Special_Interest_GroupDao;
import special_interest_group.domain.Special_Interest_Group;
//import entity1.service.Entity1Exception;
//import entity1.service.Entity1Service;
/**
 * Servlet implementation class UserServlet
 */

public class Special_Interest_GroupServletDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Special_Interest_GroupServletDelete() {
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
		Special_Interest_GroupDao sigdao = new Special_Interest_GroupDao();
		Special_Interest_Group sig = null;
		if(method.equals("search"))
		{
			try {
//				entity1dao to Entity1Dao
				sig = Special_Interest_GroupDao.findByGroupID(Integer.parseInt(request.getParameter("group_id")));
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
		
//			Entity1Service entity1service = new Entity1Service();		
			if(sig.getGroup_name()!=null){
						System.out.println(sig);
						request.setAttribute("special_interest_group", sig);
						request.getRequestDispatcher("/jsps/special_interest_group/special_interest_group_delete_output.jsp").forward(request, response);
					
				}
				else{
				request.setAttribute("msg", "Special Interest group not found");
				request.getRequestDispatcher("/jsps/special_interest_group/special_interest_group_read_output.jsp").forward(request, response);
			}
		}
		else if(method.equals("delete"))
		{	
			try {
				sigdao.delete(request.getParameter("group_id"));
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
			request.setAttribute("msg", "Special Interest Group Deleted");
			request.getRequestDispatcher("/jsps/special_interest_group/special_interest_group_read_output.jsp").forward(request, response);
		}
	}
}




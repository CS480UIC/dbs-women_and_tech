package special_interest_group.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import special_interest_group.dao.Special_Interest_GroupDao;
import special_interest_group.domain.Special_Interest_Group;
//import entity1.service.Entity1Service;

/**
 * Servlet implementation class UserServlet
 */

public class Special_Interest_GroupServletUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Special_Interest_GroupServletUpdate() {
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
				sig = Special_Interest_GroupDao.findByGroupID(Integer.parseInt(request.getParameter("group_id")));
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
		
//			Entity1Service entity1service = new Entity1Service();		
			if(sig.getGroup_id()!=null){
				System.out.println("11");

				System.out.println(sig);
				request.setAttribute("special_interest_group", sig);
				request.getRequestDispatcher("/jsps/special_interest_group/special_interest_group_update_output.jsp").forward(request, response);
					
			}else{
					
				request.setAttribute("msg", "Special Interest Group not found");
				request.getRequestDispatcher("/jsps/special_interest_group/special_interest_group_read_output.jsp").forward(request, response);
			}
		}
		else if(method.equals("update"))
		{
//			Map<String,String[]> paramMap = request.getParameterMap();
			Special_Interest_Group form = new Special_Interest_Group();
//			List<String> info = new ArrayList<String>();
//
//			for(String name : paramMap.keySet()) {
//				
//				String[] values = paramMap.get(name);
//				info.add(values[0]);
//				System.out.println(name + ": " + Arrays.toString(values));
//			}
			
			form.setGroup_id(Integer.parseInt(request.getParameter("group_id")));
    		form.setGroup_name(request.getParameter("group_name"));
    		form.setMembers_id(Integer.parseInt(request.getParameter("members_id")));
    		form.setMission_statement(request.getParameter("mission_statement"));
    		form.setGroup_type(request.getParameter("group_type"));
    		form.setWebpage_url(request.getParameter("webpage_url"));
    		form.setDate_created(java.sql.Date.valueOf(request.getParameter("date_created")));

			try {
				sigdao.update(form);

			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
			request.setAttribute("msg", "Special Interest Group Updated");
			request.getRequestDispatcher("/jsps/special_interest_group/special_interest_group_read_output.jsp").forward(request, response);
		}
	}
}




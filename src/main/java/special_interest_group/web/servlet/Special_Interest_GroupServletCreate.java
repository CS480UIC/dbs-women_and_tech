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

import special_interest_group.domain.Special_Interest_Group;
import special_interest_group.service.Special_Interest_GroupException;
import special_interest_group.service.Special_Interest_GroupService;


/**
 * Servlet implementation class UserServlet
 */

public class Special_Interest_GroupServletCreate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Special_Interest_GroupServletCreate() {
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
		Special_Interest_GroupService sigservice = new Special_Interest_GroupService();
		Map<String,String[]> paramMap = request.getParameterMap();
		Special_Interest_Group form = new Special_Interest_Group();
		List<String> info = new ArrayList<String>();
		System.out.println(form);
		for(String name : paramMap.keySet()) {
			
			String[] values = paramMap.get(name);
			info.add(values[0]);
//			System.out.println(name + ": " + Arrays.toString(values));
//			System.out.println(info.add(values[0]));

		}


		form.setGroup_id(Integer.parseInt(info.get(0)));
		form.setGroup_name(info.get(1));
		form.setMembers_id(Integer.parseInt(info.get(2)));	
		form.setMission_statement(info.get(3));
		form.setGroup_type(info.get(4));
		form.setWebpage_url(info.get(5));	
		form.setDate_created(java.sql.Date.valueOf(info.get(6)));
		
		
		try {
			System.out.println("3");
			sigservice.create(form);
			response.sendRedirect( request.getContextPath() + "/jsps/main.jsp");
			
		} catch (ClassNotFoundException | Special_Interest_GroupException e) {
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

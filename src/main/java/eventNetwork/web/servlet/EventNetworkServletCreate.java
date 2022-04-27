/**
 * 
 */
/**
 * @author diyinhu
 *
 */
package eventNetwork.web.servlet;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import entity1.domain.Entity1;
//import entity1.service.Entity1Exception;
//import entity1.service.Entity1Service;

/*I stop here for import file */
import eventNetwork.domain.eventNetwork;
import eventNetwork.service.EventNetworkException;
import eventNetwork.service.EventNetworkService;


/**
 * Servlet implementation class UserServlet
 */

public class EventNetworkServletCreate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EventNetworkServletCreate() {
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
		EventNetworkService eventNetworkservice = new EventNetworkService();
		Map<String,String[]> paramMap = request.getParameterMap();
		eventNetwork form = new eventNetwork();
		List<String> info = new ArrayList<String>();
		System.out.println(form);
		for(String name : paramMap.keySet()) {
			
			String[] values = paramMap.get(name);
			info.add(values[0]);
			System.out.println(name + ": " + Arrays.toString(values));
			System.out.println(info.add(values[0]));

		}
//		System.out.println("1");
//		System.out.println(info);

		form.setEventID(info.get(1));
//		System.out.println("1");

		form.setMemberID(info.get(2));
//		System.out.println("2");

		form.setEventTitle(info.get(3));
		form.setEventAddress(info.get(4));
		form.setEventDate(info.get(5));
//		System.out.println("3");
		
		
		try {
			System.out.println("5");
			eventNetworkservice.create(form);
			response.sendRedirect( request.getContextPath() + "/jsps/main.jsp");
			
		} catch (ClassNotFoundException | EventNetworkException e) {
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

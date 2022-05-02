/**
 * 
 */
/**
 * @author diyinhu
 *
 */
package eventNetwork.web.servlet;


import java.io.IOException;
import java.sql.Date;
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
import eventNetwork.domain.event_network;
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
		EventNetworkService Network_event_service = new EventNetworkService();
		Map<String,String[]> paramMap = request.getParameterMap();
		event_network form = new event_network();
		List<String> info = new ArrayList<String>();

		for(String name : paramMap.keySet()) {
			String[] values = paramMap.get(name);
			info.add(values[0]);
		}
		form.setEventID(Integer.valueOf(info.get(0)) );
		form.setMemberID(Integer.valueOf(info.get(1)));
		form.setEventTitle(info.get(2));	
		form.setEventAddress(info.get(3));
		form.setEventDate(Date.valueOf(info.get(4)) );

		
		try {
			Network_event_service.create(form);
			response.sendRedirect( request.getContextPath() + "/jsps/main.jsp");
			
		} catch (ClassNotFoundException | EventNetworkException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} 
		
	}

}

package eventNetwork.web.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import eventNetwork.dao.EventDao;
import eventNetwork.domain.eventNetwork;


public class EventNetworkServletRead extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EventNetworkServletRead() {
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
		eventNetwork eventNetwork = null;
		EventDao eventNetworkDao = new EventDao();
		
		try {
			eventNetwork = eventNetworkDao.findByUsername(request.getParameter("event_id"));
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		}
		
		if(eventNetwork.getEventID() !=null){
					System.out.println(eventNetwork);
					request.setAttribute("eventNetwork", eventNetwork);
					request.getRequestDispatcher("/jsps/network_event/event_read_output.jsp").forward(request, response);
			}
			else{
			request.setAttribute("msg", "eventNetwork not found");
			request.getRequestDispatcher("/jsps/network_event/event_read_output.jsp").forward(request, response);
		}
	}
	

}

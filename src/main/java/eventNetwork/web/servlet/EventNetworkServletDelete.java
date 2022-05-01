package eventNetwork.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import eventNetwork.dao.EventDao;
import eventNetwork.domain.event_network;


public class EventNetworkServletDelete extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EventNetworkServletDelete() {
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
		String method = request.getParameter("method");
		EventDao eventNetworkDao = new EventDao();
		event_network eventNetwork = null;
		if(method.equals("search"))
		{
			try {
				eventNetwork = eventNetworkDao.findByUsername(request.getParameter("eventID"));
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
		
			if(eventNetwork.getEventID()!=null){
						System.out.println(eventNetwork);
						request.setAttribute("eventNetwork", eventNetwork);
						request.getRequestDispatcher("/jsps/network_event/event_delete_output.jsp").forward(request, response);			
				}
				else{
				request.setAttribute("msg", "eventNetwork not found");
				request.getRequestDispatcher("/jsps/network_event/event_read_output.jsp").forward(request, response);
			}
		}
		else if(method.equals("delete"))
		{	
			try {
				
				EventDao.delete(request.getParameter("eventID"));
				
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
			request.setAttribute("msg", "eventNetwork Deleted");
			request.getRequestDispatcher("/jsps/network_event/event_read_output.jsp").forward(request, response);
		}
	}
	

}

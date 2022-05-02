package eventNetwork.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import entity1.dao.Entity1Dao;
//import entity1.domain.Entity1;
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
		EventDao EventDao = new EventDao();
		event_network event_network = null;
		if(method.equals("search"))
		{
			try {
				event_network = EventDao.findByEventAndMember(Integer.valueOf(request.getParameter("eventID")) , Integer.valueOf(request.getParameter("memberID")));
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
		
			if(event_network.getEventID()!=null && event_network.getMemberID() != null){
						System.out.println(event_network);
						request.setAttribute("event_network", event_network);
						request.getRequestDispatcher("/jsps/network_event/event_delete_output.jsp").forward(request, response);			
				}
				else{
				request.setAttribute("event_network", "Entity not found");
				request.getRequestDispatcher("/jsps/network_event/event_read_output.jsp").forward(request, response);
			}
		}
		else if(method.equals("delete"))
		{	
			try {
				System.out.println("event id from delete: " + request.getParameter("eventID"));
				System.out.println("member id from delete: " + request.getParameter("memberID"));
				
				EventDao.delete(Integer.valueOf(request.getParameter("eventID")) , Integer.valueOf(request.getParameter("memberID")));
				
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
			response.sendRedirect( request.getContextPath() + "/jsps/main.jsp");
		}
	}
	

}

package eventNetwork.web.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import eventNetwork.dao.EventDao;
import eventNetwork.domain.event_network;

//import network_event.domain.Network_Event;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.io.PrintWriter;

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
		event_network event_network = null;
		EventDao EventDao = new EventDao();
		
		
		try {
			event_network = EventDao.findByEventAndMember(Integer.valueOf(request.getParameter("eventID")) , Integer.valueOf(request.getParameter("memberID")));
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		}
		
		if(event_network.getEventID()!=null && event_network.getMemberID()!=null){
					System.out.println("Network event in read file: " + event_network.getEventID());
					System.out.println("title in read file: " + event_network.getEventTitle());
					
					
					request.setAttribute("event_network", event_network);
					request.getRequestDispatcher("/jsps/network_event/event_read_output.jsp").forward(request, response);
			}
			else{
			request.setAttribute("msg", "network_event not found");
			request.getRequestDispatcher("/jsps/network_event/event_read_output.jsp").forward(request, response);
		}
	}
	

}



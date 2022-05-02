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

import eventNetwork.dao.EventDao;
import eventNetwork.domain.event_network;

public class EventNetworkServletUpdate extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EventNetworkServletUpdate() {
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
		event_network eventNetwork = null;

		if(method.equals("search"))
		{
			try {
				eventNetwork = EventDao.findByEventAndMember(Integer.valueOf(request.getParameter("eventID")) , Integer.valueOf(request.getParameter("memberID")));
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}

			if(eventNetwork.getEventID()!=null && eventNetwork.getMemberID() != null){
				request.setAttribute("event_network", eventNetwork);
				request.getRequestDispatcher("/jsps/network_event/event_update_output.jsp").forward(request, response);

			}
			else{
				request.setAttribute("msg", "eventNetwork not found");
				request.getRequestDispatcher("/jsps/network_event/event_update_output.jsp").forward(request, response);
			}
		}
		else if(method.equals("update"))
		{
			Map<String,String[]> paramMap = request.getParameterMap();
			event_network form = new event_network();
			List<String> info = new ArrayList<String>();

			for(String name : paramMap.keySet()) {
				String[] values = paramMap.get(name);
				info.add(values[0]);
				System.out.println("testing: " + values[0]);
				
			}
			
			System.out.println("position: " + info.get(3));
			
			System.out.println("show event id: " + Integer.valueOf(request.getParameter("eventID")));
			System.out.println("show member id: " + Integer.valueOf(request.getParameter("memberID")));
			
			form.setEventID(Integer.valueOf(request.getParameter("eventID")));
			form.setMemberID(Integer.valueOf(request.getParameter("memberID")));

			form.setEventTitle(info.get(3));	
			form.setEventAddress(info.get(4));
			form.setEventDate(Date.valueOf(info.get(5)) );

			try {
				EventDao.update(form);
				request.setAttribute("event_network", eventNetwork);
				request.getRequestDispatcher("/jsps/network_event/event_read_output.jsp").forward(request, response);

			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
			
		}
	}

}

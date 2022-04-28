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

import eventNetwork.dao.EventDao;
import eventNetwork.domain.eventNetwork;

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
		EventDao eventNetworkdao = new EventDao();
		eventNetwork eventNetwork = null;

		if(method.equals("search"))
		{
			try {
				eventNetwork = eventNetworkdao.findByUsername(request.getParameter("event_id"));
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}

			if(eventNetwork.getEventID()!=null){
				request.setAttribute("eventNetwork", eventNetwork);
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
			eventNetwork form = new eventNetwork();
			List<String> info = new ArrayList<String>();

			for(String name : paramMap.keySet()) {
				String[] values = paramMap.get(name);
				info.add(values[0]);
			}
		
			form.setMemberID(info.get(2));
			form.setEventTitle(info.get(3));
			form.setEventAddress(info.get(4));
			form.setEventDate(info.get(5));
			
			form.setEventID(request.getParameter("event_id"));

			try {
				eventNetworkdao.update(form);

			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
			request.setAttribute("msg", "eventNetwork Updated");
			request.getRequestDispatcher("/jsps/network_event/event_read_output.jsp").forward(request, response);
		}
	}

}

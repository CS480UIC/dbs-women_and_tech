package learning_resource.web.servlet;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import learning_resource.domain.Learning_Resource;
import learning_resource.dao.ResourceDao;

public class LearningResourceServletUpdate extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LearningResourceServletUpdate() {
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
		ResourceDao resourceDao = new ResourceDao();
		Learning_Resource lr = null;

		if(method.equals("search"))
		{
			try {
				lr = resourceDao.findByResourceAndMember(Integer.valueOf(request.getParameter("resourceID")) , Integer.valueOf(request.getParameter("memberID")));
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}

			if(lr.getResourceID()!=null && lr.getMemberID() != null){
				request.setAttribute("learning_resource", lr);
				request.getRequestDispatcher("/jsps/learning_resource/resource_update_output.jsp").forward(request, response);

			}
			else{
				request.setAttribute("msg", "learning_resource not found");
				request.getRequestDispatcher("/jsps/learning_resource/resource_update_output.jsp").forward(request, response);
			}
		}
		else if(method.equals("update"))
		{
			Map<String,String[]> paramMap = request.getParameterMap();
			Learning_Resource form = new Learning_Resource();
			List<String> info = new ArrayList<String>();

			for(String name : paramMap.keySet()) {
				String[] values = paramMap.get(name);
				info.add(values[0]);
				System.out.println("testing: " + values[0]);
				
			}
			
			
			form.setResourceID(Integer.valueOf(request.getParameter("resourceID")));
			form.setMemberID(Integer.valueOf(request.getParameter("memberID")));
			form.setResourceTitle(info.get(3));	
			form.setResourceType(info.get(4));
			form.setAuthor(info.get(5));		
			form.setPublisher(info.get(6));
			form.setPublishYear(Integer.valueOf(info.get(7)));
			form.setLanguage(info.get(8));
			

			try {
				resourceDao.update(form);
				request.setAttribute("learning_resource", lr);
				request.getRequestDispatcher("/jsps/learning_resource/resource_read_output.jsp").forward(request, response);

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

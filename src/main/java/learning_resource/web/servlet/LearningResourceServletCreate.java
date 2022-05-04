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


import learning_resource.service.LearningResourceService;
import learning_resource.domain.Learning_Resource;
import learning_resource.service.LearningResourceException;

public class LearningResourceServletCreate extends HttpServlet{
	
private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LearningResourceServletCreate() {
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
		LearningResourceService lr_service = new LearningResourceService();
		Map<String,String[]> paramMap = request.getParameterMap();
		Learning_Resource form = new Learning_Resource();
		List<String> info = new ArrayList<String>();

		for(String name : paramMap.keySet()) {
			String[] values = paramMap.get(name);
			info.add(values[0]);
		}
		
		
		form.setResourceID(Integer.valueOf(info.get(0)));
		form.setMemberID(Integer.valueOf(info.get(1)));
		form.setResourceTitle(info.get(2));	
		form.setResourceType(info.get(3));
		form.setAuthor(info.get(4));		
		form.setPublisher(info.get(5));
		form.setPublishYear(Integer.valueOf(info.get(6)));
		form.setLanguage(info.get(7));

		
		try {
			lr_service.create(form);
			response.sendRedirect( request.getContextPath() + "/jsps/main.jsp");
			
		} catch (ClassNotFoundException | LearningResourceException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} 
		
	}

}

package learning_resource.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import learning_resource.domain.Learning_Resource;
import learning_resource.dao.ResourceDao;


public class LearningResourceServletRead extends HttpServlet{
private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LearningResourceServletRead() {
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
		Learning_Resource learning_resource = null;
		ResourceDao resourceDao = new ResourceDao();
		
		System.out.println("get ln ID: " + request.getParameter("resourceID"));
		System.out.println("get member id: " + Integer.valueOf(request.getParameter("memberID")));
		
		try {
			learning_resource = resourceDao.findByResourceAndMember(Integer.valueOf(request.getParameter("resourceID")) , Integer.valueOf(request.getParameter("memberID")));
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		}
		
		if(learning_resource.getResourceID()!=null && learning_resource.getMemberID()!=null){
					System.out.println("Learning Resource in read file: " + learning_resource.getResourceID());
					System.out.println("title in read file: " + learning_resource.getMemberID());
					
					
					request.setAttribute("learning_resource", learning_resource);
					request.getRequestDispatcher("/jsps/learning_resource/resource_read_output.jsp").forward(request, response);
			}
			else{
			request.setAttribute("msg", "learning_resource not found");
			request.getRequestDispatcher("/jsps/learning_resource/resource_read_output.jsp").forward(request, response);
		}
	}
}

package learning_resource.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import learning_resource.domain.Learning_Resource;
import learning_resource.dao.ResourceDao;

public class LearningResourceServletDelete extends HttpServlet{
	
private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LearningResourceServletDelete() {
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
						request.getRequestDispatcher("/jsps/learning_resource/resource_delete_output.jsp").forward(request, response);			
				}
				else{
				request.setAttribute("learning_resourcek", "learning_resource not found");
				request.getRequestDispatcher("/jsps/learning_resource/resource_read_output.jsp").forward(request, response);
			}
		}
		else if(method.equals("delete"))
		{	
			try {
				System.out.println("event id from delete: " + request.getParameter("resourceID"));
				System.out.println("member id from delete: " + request.getParameter("memberID"));
				
				resourceDao.delete(Integer.valueOf(request.getParameter("resourceID")) , Integer.valueOf(request.getParameter("memberID")));
				
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

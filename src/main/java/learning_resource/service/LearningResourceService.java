package learning_resource.service;

import java.util.List;

import learning_resource.dao.ResourceDao;
import learning_resource.domain.Learning_Resource;

public class LearningResourceService {
	
private ResourceDao resourceDao = new ResourceDao();
	
	public void create(Learning_Resource form) throws LearningResourceException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		// check the primary key of Entity1
		Learning_Resource ar = resourceDao.findByResourceAndMember(form.getResourceID(), form.getMemberID());
		
		if(ar.getResourceTitle()!=null && ar.getResourceID().equals(form.getResourceID()) && ar.getMemberID().equals(form.getMemberID())) throw new LearningResourceException("This user name has been registered!");
		resourceDao.add(form);
	}
	
	public List<Object> ARUserList() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		return resourceDao.findall();
		
	}

}

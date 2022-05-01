package eventNetwork.service;

import java.util.List;





//import entity1.dao.Entity1Dao;
//import entity1.domain.Entity1;
//import entity1.service.Entity1Exception;
//import entity1.service.UserException;

import eventNetwork.dao.EventDao; 
import eventNetwork.domain.EventNetwork;
//import eventNetwork.service.EventNetworkException;


public class EventNetworkService {
	
private EventDao evDao = new EventDao();
	
	
	
	public void create(EventNetwork form) throws EventNetworkException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		// check the primary key of Entity1
		EventNetwork ar = evDao.findByEventAndMemberID(form.getEvent_id(), form.getMember_id());
		if(ar.getEvent_title()!=null && ar.getEvent_id().equals(form.getEvent_id()) && ar.getMember_id().equals(form.getMember_id())) throw new EventNetworkException("This user name has been registered!");
		evDao.add(form);
	}
	
	public List<Object> ARUserList() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		return evDao.findall();
		
	}


}


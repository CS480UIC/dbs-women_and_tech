package eventNetwork.service;

import java.util.List;

//import entity1.dao.Entity1Dao;
//import entity1.domain.Entity1;
//import entity1.service.Entity1Exception;
//import entity1.service.UserException;

import eventNetwork.dao.EventDao; 
import eventNetwork.domain.event_network;



public class EventNetworkService {
	
	private EventDao eventDao = new EventDao();
	
	public void create(event_network form) throws EventNetworkException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		// check the primary key of Entity1
		event_network ar = eventDao.findByEventAndMember(form.getEventID(), form.getMemberID());
		
		if(ar.getEventTitle()!=null && ar.getEventID().equals(form.getEventID()) && ar.getMemberID().equals(form.getMemberID())) throw new EventNetworkException("This user name has been registered!");
		eventDao.add(form);
	}
	
	public List<Object> ARUserList() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		return eventDao.findall();
		
	}
	
	public List<Object> memberEventList() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		return eventDao.findMemberPerEvent();
		
	}
	
}

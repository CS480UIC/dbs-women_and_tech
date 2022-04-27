package eventNetwork.service;

//import entity1.dao.Entity1Dao;
//import entity1.domain.Entity1;
//import entity1.service.Entity1Exception;
//import entity1.service.UserException;

import eventNetwork.dao.EventDao; 
import eventNetwork.domain.eventNetwork;



public class EventNetworkService {
	
private EventDao eventDao = new EventDao();
	
	/**
	 * register a Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void create(eventNetwork form) throws EventNetworkException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		
		// check the primary key of Entity1
		eventNetwork event = eventDao.findByUsername(form.getEventID());
		if(event.getEventID()!=null && event.getEventID().equals(form.getEventID())) throw new EventNetworkException("This user name has been registered!");
		eventDao.add(form);
	}
	/**
	 * Login function
	 * @param form
	 * @return
	 * @throws UserException 
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void login(eventNetwork form) throws EventNetworkException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		eventNetwork event_ID = eventDao.findByUsername(form.getEventID());
		if(event_ID.getEventID()==null) throw new EventNetworkException("The user is not in the database");
		
		String member_ID = event_ID.getMemberID();
		
		if(member_ID!=null && !member_ID.equals(form.getMemberID()))
			throw new EventNetworkException(" The password is not right");
		
	}

}

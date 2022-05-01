package eventNetwork.service;

//import entity1.dao.Entity1Dao;
//import entity1.domain.Entity1;
//import entity1.service.Entity1Exception;
//import entity1.service.UserException;

import eventNetwork.dao.EventDao; 
import eventNetwork.domain.event_network;



public class EventNetworkService {
	
private EventDao eventDao = new EventDao();
	
	/**
	 * register a Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void create(event_network form) throws EventNetworkException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		
		System.out.println("server event id " + form.getEventID());
	    System.out.println("server MemberID " + form.getMemberID());
	    System.out.println("server, getEventTitle " + form.getEventTitle());
	    System.out.println("server, getEventAddress " + form.getEventAddress());
	    System.out.println("server getEventDate " + form.getEventDate());
	    
		// check the primary key of Entity1
	    event_network event = eventDao.findByUsername(form.getEventID());
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
	public void login(event_network form) throws EventNetworkException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		event_network event_ID = eventDao.findByUsername(form.getEventID());
		if(event_ID.getEventID()==null) throw new EventNetworkException("The user is not in the database");
		
		String member_ID = event_ID.getMemberID();
		
		if(member_ID!=null && !member_ID.equals(form.getMemberID()))
			throw new EventNetworkException(" The password is not right");
		
	}

}

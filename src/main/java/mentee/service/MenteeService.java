package mentee.service;


import java.util.List;

import mentee.dao.MenteeDao;
import mentee.domain.Mentee;

/**
 * logic functions such as register, login
 * @author Aayush Makharia
 *
 */
public class MenteeService {
	private MenteeDao menteeDao = new MenteeDao();
	
	/**
	 * register a Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void create(Mentee form) throws MenteeException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		
		// check the primary key of Entity1
		Mentee mentee = MenteeDao.findBymember_id(form.getMember_id());
		if(mentee.getMember_id()!=null && mentee.getMember_id().equals(form.getMember_id())) throw new MenteeException("This mentee member ID has been registered!");
		menteeDao.add(form);
	}
	
	public List<Object> findMentee() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		return menteeDao.findMentee();
		
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
//	public void login(Mentee form) throws MenteeException, ClassNotFoundException, InstantiationException, IllegalAccessException {
//		Mentee user = MenteeDao.findBymember_id(form.getUsername());
//		if(user.getUsername()==null) throw new MenteeException("The user is not in the database");
//		
//		String password = user.getPassword();
//		
//		if(password!=null && !password.equals(form.getPassword()))
//			throw new MenteeException(" The password is not right");
//		
//	}
}

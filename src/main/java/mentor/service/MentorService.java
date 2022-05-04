package mentor.service;


import java.util.List;

import mentor.dao.MentorDao;
import mentor.domain.Mentor;

/**
 * logic functions such as register, login
 * @author Aayush Makharia
 *
 */
public class MentorService {
	private MentorDao mentorDao = new MentorDao();
	
	/**
	 * register a Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void create(Mentor form) throws MentorException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		
		// check the primary key of Entity1
		Mentor mentor = MentorDao.findByMember_id(form.getMember_id());
		if(mentor.getMember_id()!=null && mentor.getMember_id().equals(form.getMember_id())) throw new MentorException("This mentor has been registered!");
		mentorDao.add(form);
	}
	
	public List<Object> findMentor() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		return mentorDao.findMentor();
		
	}
}

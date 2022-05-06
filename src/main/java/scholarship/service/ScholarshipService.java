package scholarship.service;


import java.util.List;

import scholarship.dao.ScholarshipDao;
import scholarship.domain.Scholarship;

/**
 * logic functions such as register, login
 * @author Matt
 *
 */
public class ScholarshipService {
	private ScholarshipDao scholarshipDao = new ScholarshipDao();
	
	/**
	 * register a Scholarship
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void create(Scholarship form) throws ScholarshipException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		
		// check the primary key of Entity1
		Scholarship scholarship = ScholarshipDao.findByScholarshipID(form.getScholarship_id());
		if(scholarship.getScholarship_name()!=null && scholarship.getScholarship_name().equals(form.getScholarship_name())) throw new ScholarshipException("This Sholarship has been created!");
		scholarshipDao.add(form);
	}
	
	public List<Object> findScholarship() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		return scholarshipDao.findScholarship();
		
	}
	
	public List<Object> findScholarshipLike() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		return scholarshipDao.findScholarshipLike();
		
	}
	
	public List<Object> findScholarshipRoundSqrt() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		return scholarshipDao.findScholarshipRoundSqrt();
		
	}
	
	public List<Object> findScholarshipAvg() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		return scholarshipDao.findScholarshipAvg();
		
	}
}

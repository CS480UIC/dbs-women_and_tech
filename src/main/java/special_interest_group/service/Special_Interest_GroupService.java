package special_interest_group.service;


import special_interest_group.dao.Special_Interest_GroupDao;
import special_interest_group.domain.Special_Interest_Group;

/**
 * logic functions such as register, login
 * @author Matt
 *
 */
public class Special_Interest_GroupService {
	private Special_Interest_GroupDao sigDao = new Special_Interest_GroupDao();
	
	/**
	 * register a Special_Interest_group
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void create(Special_Interest_Group form) throws Special_Interest_GroupException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		
		// check the primary key of Entity1
		Special_Interest_Group sig = Special_Interest_GroupDao.findByGroupID(form.getGroup_id());
		if(sig.getGroup_name()!=null && sig.getGroup_name().equals(form.getGroup_name())) throw new Special_Interest_GroupException("This SIG name has been registered!");
		sigDao.add(form);
	}
}

package mentee.domain;

/**
 * Mentee object
 * 
 * @author Aayush Makharia
 * 
 */
public class Mentee {
	/*
	 * Correspond to the user table
	 */
	
	private Integer member_id;
	private String field_of_interest;
	private String major;
	private String school_name;
	
	
	/**
	 * @return the member_id
	 */
	public Integer getMember_id() {
		return member_id;
	}


	/**
	 * @param member_id the member_id to set
	 */
	public void setMember_id(Integer member_id) {
		this.member_id = member_id;
	}


	/**
	 * @return the field_of_interest
	 */
	public String getField_of_interest() {
		return field_of_interest;
	}


	/**
	 * @param field_of_interest the field_of_interest to set
	 */
	public void setField_of_interest(String field_of_interest) {
		this.field_of_interest = field_of_interest;
	}



	/**
	 * @return the major
	 */
	public String getMajor() {
		return major;
	}


	/**
	 * @param major the major to set
	 */
	public void setMajor(String major) {
		this.major = major;
	}


	/**
	 * @return the school_name
	 */
	public String getSchool_name() {
		return school_name;
	}


	/**
	 * @param school_name the school_name to set
	 */
	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}


	@Override
	public String toString() {
		return "mentee [ member_id=" + member_id + ""
				+ ", field_of_interest=" + field_of_interest
				+ ", major=" + major
				+ ", school_name=" + school_name
				+"]";
		
	}
	
	
	
	
	
	
}

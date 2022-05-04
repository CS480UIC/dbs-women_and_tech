package mentor.domain;

/**
 * User object
 * 
 * @author Aayush Makharia
 * 
 */
public class Mentor {
	/*
	 * Correspond to the user table
	 */
	
	private Integer member_id;
	private Integer years_in_industry; 
	private String role_in_industry;
	private Integer years_of_mentoring;
	
	
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
	 * @return the years_in_idustry
	 */
	public Integer getYears_in_industry() {
		return years_in_industry;
	}


	/**
	 * @param years_in_industry the years_in_idustry to set
	 */
	public void setYears_in_industry(Integer years_in_industry) {
		this.years_in_industry = years_in_industry;
	}


	/**
	 * @return the role_in_industry
	 */
	public String getRole_in_industry() {
		return role_in_industry;
	}


	/**
	 * @param role_in_industry the role_in_industry to set
	 */
	public void setRole_in_industry(String role_in_industry) {
		this.role_in_industry = role_in_industry;
	}


	/**
	 * @return the years_of_mentoring
	 */
	public Integer getYears_of_mentoring() {
		return years_of_mentoring;
	}


	/**
	 * @param years_of_mentoring the years_of_mentoring to set
	 */
	public void setYears_of_mentoring(Integer years_of_mentoring) {
		this.years_of_mentoring = years_of_mentoring;
	}


	@Override
	public String toString() {
		return "mentor [ member_id=" + member_id + ""
				+ ", years_in_industry=" + years_in_industry
				+ ", role_in_industry=" + role_in_industry
				+ ", years_of_mentoring=" + years_of_mentoring
				+"]";
	}



}

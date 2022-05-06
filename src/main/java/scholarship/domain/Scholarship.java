package scholarship.domain;

import java.sql.Date;

/**
 * Scholarship object
 * 
 * @author Matt
 * 
 */
public class Scholarship {
	/*
	 * Correspond to the user table
	 */
	
	private Integer scholarship_id;
	private String scholarship_name;
	private Integer scholarship_amount;
	private String scholarship_description;
	private java.sql.Date application_deadline;
	private java.sql.Date application_released;
	private String requirements;
	
	/**
	 * @return the scholarship_id
	 */
	public Integer getScholarship_id() {
		return scholarship_id;
	}
	/**
	 * @param scholarship_id the scholarship_id to set
	 */
	public void setScholarship_id(Integer scholarship_id) {
		this.scholarship_id = scholarship_id;
	}
	/**
	 * @return the scholarship_name
	 */
	public String getScholarship_name() {
		return scholarship_name;
	}
	/**
	 * @param scholarship_name the scholarship_name to set
	 */
	public void setScholarship_name(String scholarship_name) {
		this.scholarship_name = scholarship_name;
	}
	/**
	 * @return the scholarship_amount
	 */
	public Integer getScholarship_amount() {
		return scholarship_amount;
	}
	/**
	 * @param scholarship_amount the scholarship_amount to set
	 */
	public void setScholarship_amount(Integer scholarship_amount) {
		this.scholarship_amount = scholarship_amount;
	}
	/**
	 * @return the scholarship_description
	 */
	public String getScholarship_description() {
		return scholarship_description;
	}
	/**
	 * @param scholarship_description the scholarship_description to set
	 */
	public void setScholarship_description(String scholarship_description) {
		this.scholarship_description = scholarship_description;
	}
	/**
	 * @return the application_deadline
	 */
	public java.sql.Date getApplication_deadline() {
		return application_deadline;
	}
	/**
	 * @param application_deadline the application_deadline to set
	 */
	public void setApplication_deadline(java.sql.Date application_deadline) {
		this.application_deadline = application_deadline;
	}
	/**
	 * @return the application_released
	 */
	public java.sql.Date getApplication_released() {
		return application_released;
	}
	/**
	 * @param application_released the application_released to set
	 */
	public void setApplication_released(java.sql.Date application_released) {
		this.application_released = application_released;
	}
	/**
	 * @return the requirements
	 */
	public String getRequirements() {
		return requirements;
	}
	/**
	 * @param requirements the requirements to set
	 */
	public void setRequirements(String requirements) {
		this.requirements = requirements;
	}
	
	
}

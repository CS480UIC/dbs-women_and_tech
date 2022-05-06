package special_interest_group.domain;

/**
 * User object
 * 
 * @author Matt
 * 
 */
public class Special_Interest_Group {
	/*
	 * Correspond to the user table
	 */
	
	private Integer group_id;
	private String group_name; 
	private Integer members_id;
	private String mission_statement;
	private String group_type;
	private String webpage_url;
	private java.sql.Date date_created;
	/**
	 * @return the group_id
	 */
	public Integer getGroup_id() {
		return group_id;
	}
	/**
	 * @param group_id the group_id to set
	 */
	public void setGroup_id(Integer group_id) {
		this.group_id = group_id;
	}
	/**
	 * @return the group_name
	 */
	public String getGroup_name() {
		return group_name;
	}
	/**
	 * @param group_name the group_name to set
	 */
	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}
	/**
	 * @return the members_id
	 */
	public Integer getMembers_id() {
		return members_id;
	}
	/**
	 * @param members_id the members_id to set
	 */
	public void setMembers_id(Integer members_id) {
		this.members_id = members_id;
	}
	/**
	 * @return the mission_statement
	 */
	public String getMission_statement() {
		return mission_statement;
	}
	/**
	 * @param mission_statement the mission_statement to set
	 */
	public void setMission_statement(String mission_statement) {
		this.mission_statement = mission_statement;
	}
	/**
	 * @return the group_type
	 */
	public String getGroup_type() {
		return group_type;
	}
	/**
	 * @param group_type the group_type to set
	 */
	public void setGroup_type(String group_type) {
		this.group_type = group_type;
	}
	/**
	 * @return the webpage_url
	 */
	public String getWebpage_url() {
		return webpage_url;
	}
	/**
	 * @param webpage_url the webpage_url to set
	 */
	public void setWebpage_url(String webpage_url) {
		this.webpage_url = webpage_url;
	}
	/**
	 * @return the date_created
	 */
	public java.sql.Date getDate_created() {
		return date_created;
	}
	/**
	 * @param date_created the date_created to set
	 */
	public void setDate_created(java.sql.Date date_created) {
		this.date_created = date_created;
	}
	
	
}

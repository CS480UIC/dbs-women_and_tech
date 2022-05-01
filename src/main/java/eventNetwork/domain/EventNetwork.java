package eventNetwork.domain;

public class EventNetwork {
	
	private Integer event_id;
	private Integer member_id;
	private String event_title;
	private String event_address;
	private java.sql.Date event_date;
	
	

	/**
	 * @return the event_id
	 */
	public Integer getEvent_id() {
		return event_id;
	}
	/**
	 * @param event_id the event_id to set
	 */
	public void setEvent_id(Integer event_id) {
		this.event_id = event_id;
	}
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
	 * @return the event_title
	 */
	public String getEvent_title() {
		return event_title;
	}
	/**
	 * @param event_title the event_title to set
	 */
	public void setEvent_title(String event_title) {
		this.event_title = event_title;
	}
	/**
	 * @return the event_address
	 */
	public String getEvent_address() {
		return event_address;
	}
	/**
	 * @param event_address the event_address to set
	 */
	public void setEvent_address(String event_address) {
		this.event_address = event_address;
	}
	/**
	 * @return the event_date
	 */
	public java.sql.Date getEvent_date() {
		return event_date;
	}
	/**
	 * @param the event_date to set
	 */
	public void setEvent_date(java.sql.Date event_date) {
		this.event_date = event_date;
	
	}
//	public void create(EventNetwork form) {
//		// TODO Auto-generated method stub
//		
//	}

	
}

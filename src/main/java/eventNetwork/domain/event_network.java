package eventNetwork.domain;

public class event_network {
	
	private Integer event_id;
	private Integer member_id; 
	private String event_title;
	private String event_address;
	private java.sql.Date event_date;
	
	
	public Integer getEventID() {
		return event_id;
	}

	public void setEventID(Integer event_id) {
		this.event_id = event_id;
	}

	public Integer getMemberID() {
		return member_id;
	}

	public void setMemberID(Integer member_id) {

		this.member_id = member_id;
	}

	public String getEventTitle() {
		
		return event_title;
	}

	public void setEventTitle(String event_title) {
		this.event_title = event_title;
	}
	
	public String getEventAddress() {
		
		return event_address;
	}

	public void setEventAddress(String event_address) {
		this.event_address = event_address;
	}
	
	public java.sql.Date getEventDate() {
		
		return event_date;
	}

	public void setEventDate(java.sql.Date event_date) {
		this.event_date = event_date;
	}
	
		
	@Override
	public String toString() {
		return "User [ event_id=" + event_id + ", member_id="
				+ member_id + ", event_title=" + event_title +"]";
	}
}

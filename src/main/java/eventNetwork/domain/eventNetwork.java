/**
 * 
 */
/**
 * @author diyinhu
 *
 */
package eventNetwork.domain;

public class eventNetwork {
	/*
	 * Correspond to the user table
	 */
	
	private String event_id;
	private String member_id; 
	private String event_title;
	private String event_address;
	private String event_date;
	
	
	public String getEventID() {
		return event_id;
	}

	public void setEventID(String event_id) {
		this.event_id = event_id;
	}

	public String getMemberID() {
		return member_id;
	}

	public void setMemberID(String member_id) {
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
	
	public String getEventDate() {
		return event_date;
	}

	public void setEventDate(String event_date) {
		this.event_date = event_date;
	}

	@Override
	public String toString() {
		return "networkEvent [ event_id=" + event_id + ""
				+ ", member_id=" + member_id
				+ ", event_title=" + event_title
				+ ", event_address=" + event_address
				+ ", event_date=" + event_date
				+"]";
		
	}
}
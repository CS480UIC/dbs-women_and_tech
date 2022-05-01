package eventNetwork.domain;

public class event_network {
	
	private String event_id;
	private String member_id; 
	private String event_title;
	private String event_address;
	private String event_date;
	
	
	public String getEventID() {
		System.out.println("In event_id in domain: " +  event_id);
		return event_id;
	}

	public void setEventID(String event_id) {
		this.event_id = event_id;
	}

	public String getMemberID() {
		System.out.println("In member_id in domain getting call");
		System.out.println("In member_id in domain: " +  member_id);
		return member_id;
	}

	public void setMemberID(String member_id) {
		System.out.println("call member_id in domain: " +  member_id);
		this.member_id = member_id;
	}

	public String getEventTitle() {
		System.out.println("In event_title in domain: " +  event_title);
		return event_title;
	}

	public void setEventTitle(String event_title) {
		this.event_title = event_title;
	}
	
	public String getEventAddress() {
		System.out.println("In event_address in domain: " +  event_address);
		return event_address;
	}

	public void setEventAddress(String event_address) {
		this.event_address = event_address;
	}
	
	public String getEventDate() {
		System.out.println("In event_date in domain: " +  event_date);
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

package learning_resource.domain;

public class Learning_Resource {
	
	
	private Integer resource_id;
	private Integer member_id;
	private String resource_title;
	private String resource_type;
	private String author;
	private String publisher;
	private Integer publish_year;
	private String resource_language;
	
	public Integer getResourceID() {
		return resource_id;
	}

	public void setResourceID(Integer resource_id) {
		this.resource_id = resource_id;
	}
	
	public Integer getMemberID() {
		return member_id;
	}

	public void setMemberID(Integer member_id) {
		this.member_id = member_id;
	}
	
	public Integer getPublishYear() {
		return publish_year;
	}

	public void setPublishYear(Integer publish_year) {
		this.publish_year = publish_year;
	}
	
	public String getResourceTitle() {
		return resource_title;
	}

	public void setResourceTitle(String resource_title) {
		this.resource_title = resource_title;
	}
	
	public String getResourceType() {
		return resource_type;
	}

	public void setResourceType(String resource_type) {
		this.resource_type = resource_type;
	}
	
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	
	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	
	public String getLanguage() {
		return resource_language;
	}

	public void setLanguage(String resource_language) {
		this.resource_language = resource_language;
	}
}

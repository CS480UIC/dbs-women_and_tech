package user.domain;

/**
 * User object
 * @author Aayush Makharia
 */
public class User {
	/*
	 * Correspond to the user table
	 */
	
//	private String username;
//	private String password; 
//	private String email;
	
	private String member_id;
	private String member_password;
	private String first_name;
	private String last_name;
	private String birthday;
	private String education_level;
	private String email;
	private String bio;
	

	
//	@Override
//	public String toString() {
//		return "User [ username=" + username + ", password="
//				+ password + ", email=" + email +"]";
//	}
	
	
	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getMember_password() {
		return member_password;
	}

	public void setMember_password(String member_password) {
		this.member_password = member_password;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getEducation_level() {
		return education_level;
	}

	public void setEducation_level(String education_level) {
		this.education_level = education_level;
	}

	
	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}

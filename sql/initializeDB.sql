DROP DATABASE women_in_tech; 

CREATE DATABASE women_in_tech;

use women_in_tech;

CREATE TABLE member_user (

	member_id TINYINT UNSIGNED UNIQUE NOT NULL AUTO_INCREMENT,
	member_password VARCHAR(100) NOT NULL,
	first_name VARCHAR(100) NOT NULL,
	last_name VARCHAR(100) NOT NULL,
	birthday DATE NOT NULL,
	education_level VARCHAR(200),
	email VARCHAR(200) UNIQUE NOT NULL,
	bio VARCHAR(500),
	PRIMARY KEY (member_id)
);

CREATE TABLE mentor
(
	member_id TINYINT UNSIGNED UNIQUE NOT NULL,
	years_in_industry SMALLINT UNSIGNED NOT NULL,
	role_in_industry VARCHAR(200) NOT NULL,
	years_of_mentoring SMALLINT UNSIGNED NOT NULL,

	PRIMARY KEY(member_id),
	FOREIGN KEY (member_id) REFERENCEs member_user(member_id)
		ON UPDATE CASCADE
		ON DELETE CASCADE
);

CREATE TABLE mentee
(
	member_id TINYINT UNSIGNED UNIQUE NOT NULL,
	field_of_interest VARCHAR(200),
	major VARCHAR(200),
	school_name VARCHAR(400),

	PRIMARY KEY(member_id),
	FOREIGN KEY (member_id) REFERENCEs member_user(member_id)
		ON UPDATE CASCADE
		ON DELETE CASCADE
);

CREATE TABLE mentor_mentee
(
	mentor_id TINYINT UNSIGNED UNIQUE,
	mentee_id TINYINT UNSIGNED UNIQUE,
	
	PRIMARY KEY (mentor_id, mentee_id),
	FOREIGN KEY (mentor_id) REFERENCES mentor(member_id)
		ON DELETE CASCADE
		ON UPDATE CASCADE,
	FOREIGN KEY (mentee_id) REFERENCES mentee(member_id)
		ON DELETE CASCADE
		ON UPDATE CASCADE
);

CREATE TABLE learning_resource
(
	resource_id TINYINT UNSIGNED NOT NULL,
	member_id TINYINT UNSIGNED NOT NULL,
	resource_title VARCHAR(100) NOT NULL,
	resource_type VARCHAR(100) NOT NULL,
	author VARCHAR(100) NOT NULL,
	publisher VARCHAR(100) ,
	publish_year DATETIME NOT NULL,
	resource_language VARCHAR(100) NOT NULL,
  
	PRIMARY KEY (resource_id),
	FOREIGN KEY (member_id) REFERENCES member_user(member_id)
		ON UPDATE CASCADE
		ON DELETE CASCADE
);


CREATE TABLE network_event
(
	event_id TINYINT UNSIGNED NOT NULL,
	member_id TINYINT UNSIGNED NOT NULL,
	event_title VARCHAR(200) NOT NULL,
	event_address VARCHAR(200) NOT NULL,
	event_date DATETIME NOT NULL,

	PRIMARY KEY(event_id),
	FOREIGN KEY (member_id) REFERENCES member_user(member_id)
		ON UPDATE CASCADE
		ON DELETE CASCADE
);

CREATE TABLE scholarship
(
	scholarship_id TINYINT UNSIGNED UNIQUE,
	scholarship_name VARCHAR(200) UNIQUE NOT NULL,
	scholarship_amount SMALLINT UNSIGNED NOT NULL,
	scholarship_description VARCHAR(500) NOT NULL,
	application_deadline DATETIME NOT NULL,
	application_released DATETIME NOT NULL,
	requirements VARCHAR(500) NULL,

	PRIMARY KEY(scholarship_id)
);

CREATE TABLE scholarship_past_current_holder
(
	scholarship_id TINYINT UNSIGNED UNIQUE,
	past_holder TINYINT UNSIGNED UNIQUE,
	current_holder TINYINT UNSIGNED UNIQUE,

	PRIMARY KEY(scholarship_id, past_holder, current_holder),
	FOREIGN KEY (scholarship_id) REFERENCES scholarship(scholarship_id)
		ON DELETE CASCADE
		ON UPDATE CASCADE,
	FOREIGN KEY (past_holder) REFERENCES member_user(member_id)
		ON UPDATE CASCADE
		ON DELETE CASCADE,
	FOREIGN KEY (current_holder) REFERENCES member_user(member_id)
		ON UPDATE CASCADE
		ON DELETE CASCADE
);

CREATE TABLE special_interest_group
(
	group_id TINYINT UNIQUE NOT NULL,
	group_name VARCHAR(200) UNIQUE NOT NULL,
	members_id TINYINT UNSIGNED UNIQUE NULL,
	mission_statement VARCHAR(500) NULL,
	group_type VARCHAR(200) NOT NULL,
	webpage_url VARCHAR(200) UNIQUE NOT NULL,
	date_created DATETIME NOT NULL,

	PRIMARY KEY (group_id),
	FOREIGN KEY (members_id) REFERENCES member_user(member_id)
		ON UPDATE RESTRICT
		ON DELETE SET NULL
);

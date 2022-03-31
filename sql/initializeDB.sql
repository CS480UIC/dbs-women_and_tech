DROP DATABASE women_in_tech; 

CREATE DATABASE women_in_tech;

use women_in_tech;

CREATE TABLE member_user (
	member_id TINYINT UNSIGNED UNIQUE NOT NULL AUTO_INCREMENT,
    member_password VARCHAR(50) UNIQUE NOT NULL,
    first_name VARCHAR(100) NOT NULL,
    last_name VARCHAR(100) NOT NULL,
    birthday DATE NOT NULL,
    education_level VARCHAR(200),
    email VARCHAR(200) UNIQUE NOT NULL,
    bio VARCHAR(500),
    PRIMARY KEY (member_id)
);

CREATE TABLE learning_resource
(
	resource_id TINYINT UNSIGNED NOT NULL AUTO_INCREMENT,
	member_id TINYINT UNSIGNED NOT NULL,
	resource_title VARCHAR(30) NOT NULL,
	resource_type VARCHAR(10) NOT NULL,
	author VARCHAR(30) NOT NULL,
	publisher VARCHAR(30) ,
	publish_year DATETIME NOT NULL,
	resource_language VARCHAR(30) NOT NULL,
  
	PRIMARY KEY (resource_id),
	FOREIGN KEY (member_id) REFERENCES member_user(member_id)
);


CREATE TABLE network_event
(
	event_id TINYINT UNSIGNED NOT NULL AUTO_INCREMENT,
	member_id TINYINT UNSIGNED NOT NULL,
	event_title VARCHAR(30) NOT NULL,
	event_address VARCHAR(30) NOT NULL,
	event_date DATETIME NOT NULL,

	PRIMARY KEY(event_id),
	FOREIGN KEY (member_id) REFERENCES member_user(member_id)
);

CREATE TABLE scholarship
(
	scholarship_id TINYINT UNSIGNED UNIQUE AUTO_INCREMENT,
	scholarship_name VARCHAR(30) UNIQUE NOT NULL,
	scholarship_amount DECIMAL(5,2) NOT NULL,
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
	group_id TINYINT UNIQUE NOT NULL AUTO_INCREMENT,
	group_name VARCHAR(30) UNIQUE NOT NULL,
	members_id TINYINT UNSIGNED UNIQUE NULL,
	mission_statement VARCHAR(500) NULL,
	group_type VARCHAR(10) NOT NULL,
	webpage_url VARCHAR(100) UNIQUE NOT NULL,
	date_created DATETIME NOT NULL,

	PRIMARY KEY (group_id),
	FOREIGN KEY (members_id) REFERENCES member_user(member_id)
		ON UPDATE RESTRICT
		ON DELETE SET NULL
);

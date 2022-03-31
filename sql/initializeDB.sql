CREATE DATABASE women_in_tech;

use women_tech;

CREATE TABLE learning_resource
(
  Resource_ID int(5) NOT NULL,
  Member_ID int(5) NOT NULL,
  Resource_Title VARCHAR(255) NOT NULL,
  Resource_Type VARCHAR(255) NOT NULL,
  Author VARCHAR(255) NOT NULL,
  Publisher VARCHAR(255) ,
  Publish_Year VARCHAR(255) NOT NULL,
  Resource_Language VARCHAR(255) NOT NULL
  
  PRIMARY KEY(Resource_ID),
  FOREIGN KEY (Member_ID) REFERENCES member(member_id)
);


CREATE TABLE network_event
(
  event_id int(5) NOT NULL primary key,
  member_id int(5) NOT NULL,
  event_title VARCHAR(255) NOT NULL,
  event_address VARCHAR(255) NOT NULL,
  event_date date NOT NULL,
  
  PRIMARY KEY(event_id),
  FOREIGN KEY (member_id) REFERENCES member(member_id)
);

CREATE TABLE scholarship
(
  scholarship_id TINYINT UNSIGNED UNIQUE NOT NULL,
  scholarship_name VARCHAR(30) UNIQUE NOT NULL,
  scholarship_amount DECIMAL(5,2) NOT NULL,
  scholarship_description VARCHAR(500) NOT NULL,
  application_deadline DATETIME NOT NULL
  application_released DATETIME NOT NULL
  requirements VARCHAR(500) NULL
  
  PRIMARY KEY(scholarship_id)
);

CREATE TABLE scholarship_past_current_holder
(
  scholarship_id TINYINTNULL,
  past_holder TINYINT NULL,
  current_holder TINYINT NULL
  
  PRIMARY KEY(scholarship_id, past_holders, current_holder),
  FOREIGN KEY (scholarship_id) REFERENCES scholarship(scholarship_id),
  	ON DELETE SET NULL
  	ON UPDATE CASCADE
  FOREIGN KEY (past_holders) REFERENCES member(member_id),
  	ON UPDATE, DELETE CASCADE
  	ON INSERT, UPDATE RESTRICT
  FOREIGN KEY (current_holder) REFERENCES member(member_id)
  	ON UPDATE, DELETE CASCADE
  	ON INSERT, UPDATE RESTRICT
);

CREATE TABLE special_interest_group
(
  group_id TINYINT UNIQUE NOT NULL,
  group_name VARCHAR(30) UNIQUE NOT NULL,
  members_id TINYINT UNSIGNED UNIQUE NULL,
  mission_statement VARCHAR(500) NULL,
  type VARCHAR(10) NOT NULL,
  webpage_url VARCHAR(100) UNIQUE NOT NULL,
  date_created DATETIME NOT NULL
  
  PRIMARY KEY(group_id),
  	ON UPDATE CASCADE,
  FOREIGN KEY (members_id) REFERENCES member(member_id)
  	ON INSERT, UPDATE RESTRICT,
  	ON DELETE SET NULL
);

CREATE TABLE member_user
(
  member_id SMALLINT UNSIGNED UNIQUE NOT NULL,
  member_password VARCHAR(50) UNIQUE NOT NULL,
  first_name VARCHAR(100) NOT NULL,
  last_name VARCHAR(100) NOT NULL,
  birthday DATE NOT NULL,
  education_level VARCHAR(200),
  email VARCHAR(200) UNIQUE NOT NULL,
  bio VARCHAR(500),
  
  PRIMARY KEY(member_id)
);

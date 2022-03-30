CREATE DATABASE women_tech;

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
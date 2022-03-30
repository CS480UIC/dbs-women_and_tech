-- Schemas name
use tech;

CREATE TABLE user
(
  Resource_ID int(5) primary key,
  Member_ID int(5) NOT NULL,
  Resource_Title VARCHAR(255) NOT NULL,
  Resource_Type VARCHAR(255) NOT NULL,
  Author VARCHAR(255) NOT NULL,
  Publisher VARCHAR(255) ,
  Publish_Year VARCHAR(255) NOT NULL,
  Resource_Language VARCHAR(255) NOT NULL
);
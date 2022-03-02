Glossary
===

## Entities

Entity Name: User

Synonyms: User, Participant, 

Description: A member is any female of any race, religion, culture, nationality, and/or socio-economic background who signs-up to women_and_tech. Who also either is a student (k-12 or higher Ed.) or working in a tech related industry or someone who is just interesting in persuing a career in tech.

Relationships:  <br />
network_event 1(1) NOT NULL <br />
learning_resource 1(1) NOT NULL<br />
special_interest_group 1(1) NOT NULL<br />
scholarships 1(1) NOT NULL<br />
mentor 1(1) NOT NULL<br />
mentee 1(1) NOT NULL<br />

Attributes:<br />
member_id (PK) 1-1 (1)<br />
member_password 1-1 (1) NOT NULL<br />
first_name M-1 (1) NOT NULL<br />
last_name M-1 (1) NOT NULL<br />
birthday M-1 (1) NOT NULL<br />
education_level M-1 (0) NULL<br />
email 1-1 (1) NOT NULL<br />
bio 1-1 (0) NULL<br />

---

Entity Name: Mentor

Synonyms: Teacher, Leader, Counselor, Advisor

Description: A mentor is any person that is currently in the tech industry or has had experience in the tech industry.Each Mentor has at least one mentee. Each mentor should have experience in at least one tech topic.

Relationships: <br />
mentee M(1) <br />

Attributes: <br />
member_id (PK FK) 1-1 (1)<br />
years_in_industry M-1 (1) NOT NULL<br />
role_in_industry M-M (1) NOT NULL<br />
mentee_id(FK) 1-M (1) NOT NULL<br />
years_of mentoring 1-1 (1) NOT NULL<br />

---

Entity Name: Mentee

Synonyms: Student, Follower, Trainee, Intern

Description: A mentee is ny person that is currently interested in the tech industry, but needs some guidence on how to navigate through school, bootcamps, etc for software engineering or any tech related field. A mentee can have multiple mentors to guide them through different topics related to tech.

Relationships: <br />
mentor M(1) <br />

Attributes: <br />
member_id (PK FK) 1-1 (1) <br />
field_of_interest M-M (0)  NULL<br />
mentor_id(FK) 1-M (1)  NOT NULL<br />
major M-M (0)  NULL<br />
school_name M-M (0)  NULL<br />

---
Entity Name: mentor_mentee

Synonyms: Student, Follower, Trainee, Intern, Teacher, Leader, Counselor, Advisor

Description: Store mentor and mentee ID. Both are foreign key.

Relationships: <br />
mentor M(1) <br />
mentee M(1) <br />

Attributes: <br />
PK (mentor_id FK, mentee_id FK) M-M(1) <br>

---

Entity Name: Scholarships

Synonyms: Awards, Gants, Montary Aid(s)

Description: These are montary awards to aid in the finiancial security bearing members. Anyone can apply (before the deadline) for one, but some have pre-requesets. 

Relationships: <br>
member_info M(1) <br />

Attributes: <br>
scholarship_id (PK) 1-1 (1) <br>
scholarship_name M-M (1) NOT NULL<br>
Scholarship_amount M-1 (1) NOT NULL<br>
past_holders (FK) M-M (0) NULL<br>
current_holders (FK) M-M (0) NULL<br>
scholarship_description 1-M (1) NOT NULL<br>
application_deadline 1-M (1) NOT NULL<br>
application_released 1-M (1) NOT NULL<br>
requirements M-M (0) NULL<br>

---

Entity Name: Network Event

Synonyms: Conferance, Workshop, Program

Description: A member who can attemp multiple tech events without duplicate time. Event can conduct in different address and date, but title is unique.

Relationships: <br />
member_info M(1) <br />

Attributes: <br />
event_id (PK) 1-1 (1)<br />
member_id (FK) 1-1 (1) NOT NULL<br />
event_title M-1 (1) NOT NULL<br />
event_address 1-M (1) NOT NULL<br />
event_date M-M (1) NOT NULL<br />

---

Entity Name:  Learning Resource

Synonyms: Learning aid, self-teaching tool, 

Description: Learning resource are text books, films, plays, radio programs, images, speeches, multimedia, lectures, or online teaching tool that related to tech feild.

Relationships: <br />
member_info M(1) <br />

Attributes: <br />
resource_id (PK) 1-1 (1) <br />
member_id (FK) 1-1 (1) NOT NULL<br />
resource_type 1-M (1)  NOT NULL<br />
resource_title 1-1 (1) NOT NULL<br />
publisher M-M (0) NULL<br />
author M-M (1) NOT NULL<br />
language M-M (1) NOT NULL<br />
publish_year 1-1 (1) NOT NULL<br />

---

Entity Name: Special Interest Group (SIG)

Synonyms: Advocacy Group, 

Description: This is a group of people (members) who are interested in persueing an interesting specialized hobby. All ages are welcome, and all experiences are welcome.

Relationships: <br>
member_info M(1) <br>

Attributes: <br>
group_id (PK) 1-1 (1) <br>
group_name 1-1 (1) NOT NULL<br>
members_id(FK) 1-M (1) NOT NULL <br>
mission_statement 1-M (0) NULL<br>
type 1-1 (1) NOT NULL<br>
webpage_url 1-1 (1) NOT NULL<br>
date_created 1-1(1) NOT NULL<br>

---
## Dependency Relationship
Independent Entity - User <br>
Dependent Entity - Mentor ,Mentee ,Scholarships ,Network Event ,Learning Resource ,Special Interest Group

---
## Subtype Entities
Mentor, Mentee

---
## Supertype entities
User

---
## Plural Attribute
Each scholarship had past holders. past_holder is a plural attribute of scholarship. The plural attribute past_holder moves to the new table scholarship_past_holder. The primary key of the new table is the composite of plural attribute past_holder and foreign key scholarship_id.
The foreign key scholarship references the initial table.

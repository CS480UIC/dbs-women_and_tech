Glossary
===

## Entities

Entity Name: Member

Synonyms: User, Participant, 

Description: A member is any female of any race, religion, culture, nationality, and/or socio-economic background who signs-up to women_and_tech. Who also either is a student (k-12 or higher Ed.) or working in a tech related industry or someone who is just interesting in persuing a career in tech.

---

Entity Name: Mentor

Synonyms: Teacher, Leader, Counselor, Advisor

Description: A mentor is any person that is currently in the tech industry or has had experience in the tech industry.Each Mentor has at least one mentee. Each mentor should have experience in at least one tech topic.

Relationships: <br />
member_info M(1) <br />
mentee M(1) <br />

Attributes: <br />
mentor_id(PK) 1-1 (1) <br />
member_id(FK) 1-1 (1) <br />
years_in_industry M-1 (1) <br />
role_in_industry M-M (1) <br />
mentee_id(FK) 1-M (1) <br />
years_of mentoring 1-1 (1) <br />

---

Entity Name: Mentee

Synonyms: Student, Follower, Trainee, Intern

Description: A mentee is ny person that is currently interested in the tech industry, but needs some guidence on how to navigate through school, bootcamps, etc for software engineering or any tech related field. A mentee can have multiple mentors to guide them through different topics related to tech.

Relationships:
member_info M(1)
mentee M(1)

Attributes:
mentee_id(PK) 1-1 (1)
member_id(FK) 1-1 (1)
field_of_interest M-M (0)
mentor_id(FK) 1-M (1)

---

Entity Name: Scholarships

Synonyms: Awards, Gants, Montary Aid(s)

Description: These are montary awards to aid in the finiancial security bearing members. Anyone can apply (before the deadline) for one, but some have pre-requesets. 

---

Entity Name: Network Event

Synonyms: Conferance, Workshop, Program

Description: 

---

Entity Name:  Learning Resource

Synonyms: Learning aid, self-teaching tool, 

Description: 

---

Entity Name: Special Interest Group (SIG)

Synonyms: Advocacy Group, 

Description: This is a group of people (members) who are interested in persueing an interesting specialized hobby. All ages are welcome, and all experiences are welcome.

---

<br>

## Relationship Cordinality

---
<br>

## Atribute Cordinality

---

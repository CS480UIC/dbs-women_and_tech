use women_in_tech;

-- Simple Queries

select *
from learning_resource
where Resource_Type = 'Book'
order by Member_ID
;

select event_id, event_title
from network_event
where member_id = 1
;

select *
from scholarship
where scholarship_amount > 700 -- Amount > $700
;

-- Aggregate Queries

select Member_ID, count(*) as total_resourse
from learning_resource
group by Member_ID
HAVING COUNT(*) = 1
;


select event_title, event_address, date(event_date) as date_time
from network_event
;

select *
from scholarship
where description like '%bootcamp%' -- check if the scholarship description contasins the words 'bootcamp'
;

-- Complex Queries

select b.first_name, b.last_name, a.resource_type, a.resource_title, a.resource_language
from learning_resource a
left join member b
on a.member_id = b.member_id
;


select *
from scholarship
where scholarship_amount > ( 
	select avg(scholarship_amount)
	from scholarship
) -- check if the scholarship description contasins the words 'bootcamp'
;
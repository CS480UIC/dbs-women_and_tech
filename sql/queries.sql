use women_in_tech;

-- Simple Queries

select *
from learning_resource
where Resource_Type = '"Book"'
order by Member_ID
;

select event_id, event_title
from network_event
where member_id = 1
order by event_title
;

select *
from scholarship
where scholarship_amount > 700 -- Amount > $700
order by scholarship_amount
;

select *
from mentee
where major = '"CS"'
order by school_name
;

-- -- Aggregate Queries

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
where scholarship_description like '%bootcamp%' -- check if the scholarship description contasins the words 'bootcamp'
;

select ROUND(SQRT(scholarship_amount), 1)
from scholarship
;

select replace(school_name, 'University of Illinois at Chicago', 'UIC')
from mentee
;

select ABS(datediff(application_released, application_deadline))
from scholarship
;

-- -- Complex Queries

select b.first_name, b.last_name, a.resource_type, a.resource_title, a.resource_language
from learning_resource a
left join member_user b
on a.member_id = b.member_id
;


select *
from scholarship
where scholarship_amount > ( 
	select avg(scholarship_amount)
	from scholarship
) -- check if the scholarship description contasins the words 'bootcamp'
;

select *
from learning_resource C
where exists
	(select *
    from network_event
    where event_id = C.resource_id
    );
use women_in_tech;

-- Simple Queries

select *
from learning_resource
where Resource_Type = '"Book"'
order by Member_ID
;

select *
from network_event
;

select *
from scholarship
where scholarship_amount > 700 -- Amount > $700
order by scholarship_amount
;

select *
from mentee
where major = 'CS'
order by school_name
;

-- -- Aggregate Queries

select event_id, count(member_id) as num_member 
from network_event 
group by event_id
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

select resource_id, first_name, last_name, resource_title , resource_type, education_level 
from  learning_resource a 
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
from mentor
where years_of_mentoring > (
	select avg(years_of_mentoring)
    from mentor
);


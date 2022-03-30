use tech;

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

-- Aggregate Queries

select Member_ID, count(*) as total_resourse
from learning_resource
group by Member_ID
;


select event_title, event_address, date(event_date) as date_time
from network_event
;

-- Complex Queries
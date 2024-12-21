SELECT MEMBER_ID, member_name, gender, date_format(date_of_birth, '%Y-%m-%d')
from member_profile
where gender like "W" and month(date_of_birth)=03 and TLNO is not null
order by member_id
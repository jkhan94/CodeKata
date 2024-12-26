SELECT m.MEMBER_NAME, r.REVIEW_TEXT, date_format(r.REVIEW_DATE, '%Y-%m-%d')as review_date
from MEMBER_PROFILE as m join REST_REVIEW as r on m.member_id=r.member_id
where r.member_id = (select member_id 
                      from rest_review 
                      group by member_id
                      order by count(member_id) desc
                      limit 1
                     )
order by review_date, r.review_text
SELECT r.REST_ID, i.REST_NAME, i.FOOD_TYPE, i.FAVORITES, i.ADDRESS, 
        round(avg(r.review_score),2) as "SCORE"
from REST_INFO as i join REST_REVIEW as r on i.REST_ID=r.REST_ID
where i.ADDRESS like "서울%"
group by r.rest_id
order by SCORE desc, i.favorites desc
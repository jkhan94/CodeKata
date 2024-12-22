SELECT YEAR(SALES_DATE) as "YEAR", MONTH(SALES_DATE) as "MONTH", 
       i.GENDER, count(distinct s.user_id) as "USERS"
from USER_INFO as i join ONLINE_SALE as s on i.user_id=s.user_id
where gender is not null
group by YEAR(SALES_DATE), MONTH(SALES_DATE), i.gender
order by YEAR(SALES_DATE), MONTH(SALES_DATE), i.GENDER
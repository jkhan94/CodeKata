-- 정규식 활용
# SELECT CAR_TYPE, COUNT(CAR_TYPE) AS CASRS 
# FROM CAR_RENTAL_COMPANY_CAR 
# WHERE REGEXP_LIKE(OPTIONS, '통풍시트|열선시트|가죽시트') 
# GROUP BY CAR_TYPE 
# ORDER BY CAR_TYPE ASC;
# 출처: https://ittrue.tistory.com/387 [IT is True:티스토리]

SELECT car_type, count(car_id) as cars
from CAR_RENTAL_COMPANY_CAR
where OPTIONS like '%통풍시트%' or OPTIONS like'%열선시트%' or OPTIONS like'%가죽시트%'
group by car_type
order by car_type
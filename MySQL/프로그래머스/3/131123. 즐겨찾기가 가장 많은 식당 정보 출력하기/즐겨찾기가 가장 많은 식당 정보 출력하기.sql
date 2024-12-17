SELECT FOOD_TYPE, REST_ID, REST_NAME, FAVORITES
from REST_INFO
where favorites in (select max(favorites) from rest_info group by food_type)
group by food_type
order by FOOD_TYPE desc

# SQL 실행순서
# from
# where : 
# group by
# having : 그룹에 조건 건다. 예) AVG
# select
# order by
# limit
SELECT category, max(price) as MAX_PRICE, product_name
from food_product
where category in ('과자', '국', '김치', '식용유') and
      price in (select max(price) from food_product group by category)
group by category
order by MAX_PRICE desc

# select * 
# from food_product
# order by category, price desc

# 이것도 가능
# SELECT CATEGORY, PRICE AS MAX_PRICE, PRODUCT_NAME
# FROM FOOD_PRODUCT
# WHERE (CATEGORY, PRICE) IN (
#                             SELECT CATEGORY, MAX(PRICE)
#                             FROM FOOD_PRODUCT
#                             GROUP BY CATEGORY
#                             HAVING CATEGORY IN ('국', '김치', '식용유', '과자')
# )ORDER BY MAX_PRICE DESC
# https://jaehwaseo.tistory.com/30
-- 서브쿼리
# SELECT PRODUCT_ID, PRODUCT_NAME, PRODUCT_CD, CATEGORY, PRICE
# from food_product
# where price = (select max(price) from food_product)

-- 정렬
SELECT PRODUCT_ID, PRODUCT_NAME, PRODUCT_CD, CATEGORY, PRICE
from food_product
order by price desc
limit 1
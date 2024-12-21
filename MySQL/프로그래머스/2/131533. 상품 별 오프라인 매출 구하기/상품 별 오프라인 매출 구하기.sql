-- 코드를 입력하세요
SELECT p.product_code, p.price*sum(o.SALES_AMOUNT) as sales
from product as p join offline_sale as o on p.product_id = o.product_id
group by p.product_code
order by sales desc, p.product_code asc

# SELECT *
# from product as p join offline_sale as o on p.product_id = o.product_id
# order by p.product_code
SELECT p.product_id, p.product_name, p.price*sum(o.amount) as TOTAL_SALES
from food_product as p join food_order as o on p.PRODUCT_ID=o.PRODUCT_ID
where o.PRODUCE_DATE like '2022-05%'
group by o.product_id
order by TOTAL_SALES desc, o.product_id

# select *
# from food_product as p join food_order as o on p.PRODUCT_ID=o.PRODUCT_ID
# order by o.produce_date desc, p.product_id, p.product_name
SELECT truncate(price,-4) as price_group, count(product_id) as PRODUCTS
from product
group by price_group
order by price_group
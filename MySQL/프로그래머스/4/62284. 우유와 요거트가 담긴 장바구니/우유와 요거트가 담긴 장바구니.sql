select CART_ID
from cart_products
where name in ("Milk", "Yogurt")
group by cart_id
having count(distinct name) >=2
order by cart_id

# select *
# from (
#     select *
#     from cart_products
#     where name in ("Milk", "Yogurt")) as p
# where p.name like "Milk"
# order by p.cart_id
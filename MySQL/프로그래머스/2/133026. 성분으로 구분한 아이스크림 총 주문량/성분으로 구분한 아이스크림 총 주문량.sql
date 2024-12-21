SELECT i.INGREDIENT_TYPE, sum(f.total_order) as TOTAL_ORDER
from icecream_info as i join first_half as f on i.flavor=f.flavor
group by i.Ingredient_type
order by total_order
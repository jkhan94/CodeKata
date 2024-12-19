SELECT i.flavor
from FIRST_HALF as f left join ICECREAM_INFO as i on f.flavor=i.flavor
where i.INGREDIENT_TYPE	 like "%fruit%"
group by f.flavor
having sum(f.TOTAL_ORDER) >3000
order by sum(f.TOTAL_ORDER) desc
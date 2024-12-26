SELECT j.flavor
from FIRST_HALF as h right join july as j on h.shipment_id=j.shipment_id
group by j.flavor
order by sum(h.total_order) + sum(j.total_order) desc
limit 3
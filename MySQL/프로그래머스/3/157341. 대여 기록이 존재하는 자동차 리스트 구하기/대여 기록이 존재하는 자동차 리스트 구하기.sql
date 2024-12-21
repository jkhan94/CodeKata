SELECT distinct(c.car_id)
from CAR_RENTAL_COMPANY_CAR as c join CAR_RENTAL_COMPANY_RENTAL_HISTORY as h on c.car_id=h.car_id
where c.car_type like "세단" and month(h.start_date)=10
order by c.car_id desc
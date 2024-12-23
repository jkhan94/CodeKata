# select *
# from CAR_RENTAL_COMPANY_RENTAL_HISTORY
# order by start_date desc, HISTORY_ID desc

SELECT history_id, car_id,
        date_format(start_date,"%Y-%m-%d") as START_DATE,
        date_format(end_date,"%Y-%m-%d") as END_DATE,
        if(datediff(end_date, start_date) +1 >= 30, "장기 대여","단기 대여") as RENT_TYPE
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
where start_date like "2022-09%"
order by HISTORY_ID desc
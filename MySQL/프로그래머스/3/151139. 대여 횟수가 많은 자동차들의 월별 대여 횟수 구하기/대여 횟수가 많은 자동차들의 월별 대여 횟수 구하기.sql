# select month(START_DATE) as MONTH, CAR_ID, count(*) as RECORDS
# from CAR_RENTAL_COMPANY_RENTAL_HISTORY
# where START_DATE between '2022-08-01' and '2022-10-31'
# and CAR_ID in (select CAR_ID
#                from CAR_RENTAL_COMPANY_RENTAL_HISTORY
#                where START_DATE between '2022-08-01' and '2022-10-31'
#                group by CAR_ID
#                having count(CAR_ID) >= 5
#               )
# group by 1, 2
# having RECORDS > 0
# order by 1, 2 desc

SELECT month(start_date) as month, car_id, count(car_id) as records
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
where date_format(start_date,'%Y-%m') between '2022-08' and '2022-10' and
car_id in (select car_id 
                 from CAR_RENTAL_COMPANY_RENTAL_HISTORY
                 where date_format(start_date,'%Y-%m') between '2022-08' and '2022-10'
                 group by car_id
                 having count(car_id)>4)
group by month, car_id
having count(car_id)>0
order by month, car_id desc
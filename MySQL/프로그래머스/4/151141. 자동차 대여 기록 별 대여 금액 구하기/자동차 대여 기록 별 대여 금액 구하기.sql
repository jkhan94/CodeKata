# 자동차 종류가 '트럭'
# 대여 기록 별로 대여 금액(컬럼명: FEE)을 구하여 
# 대여 기록 ID와 대여 금액 리스트를 출력
# 대여 금액을 기준으로 내림차순 정렬하고, 대여 금액이 같은 경우 대여 기록 ID를 기준으로 내림차순 정렬
SELECT h.history_id, 
    round((datediff(h.end_date,h.start_date)+1)*c.daily_fee*
          case
            when datediff(h.end_date,h.start_date)+1>=90 then 0.85
            when datediff(h.end_date,h.start_date)+1>=30 then 0.92
            when datediff(h.end_date,h.start_date)+1>=7 then 0.95
            else 1
          end) as "fee"
from CAR_RENTAL_COMPANY_CAR as c
        join CAR_RENTAL_COMPANY_RENTAL_HISTORY as h on c.car_id=h.car_id
        join CAR_RENTAL_COMPANY_DISCOUNT_PLAN as p on c.car_type=p.car_type
where c.car_type like '트럭'
group by h.history_id
order by fee desc, h.history_id desc
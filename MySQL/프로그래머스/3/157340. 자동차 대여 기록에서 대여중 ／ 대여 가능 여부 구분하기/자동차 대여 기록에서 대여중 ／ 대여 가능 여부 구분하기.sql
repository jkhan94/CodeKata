# SELECT *
# from CAR_RENTAL_COMPANY_RENTAL_HISTORY
# order by car_id desc, end_date desc, start_date desc

# SELECT car_id, 
#         max(case
#             when "2022-10-16" between DATE_FORMAT(START_DATE, '%Y-%m-%d') and DATE_FORMAT(end_DATE, '%Y-%m-%d')  then "대여중"
#             else "대여 가능"
#         end) as "AVAI LABILITY"
# from CAR_RENTAL_COMPANY_RENTAL_HISTORY
# group by car_id
# order by car_id desc

SELECT CAR_ID,
    MAX(CASE
        WHEN (START_DATE<'2022-10-16' AND END_DATE <'2022-10-16') 
            OR (START_DATE>'2022-10-16' AND END_DATE >'2022-10-16') THEN '대여 가능'
    ELSE '대여중'
    END) AS AVAILABILITY FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY 
GROUP BY CAR_ID
ORDER BY CAR_ID DESC
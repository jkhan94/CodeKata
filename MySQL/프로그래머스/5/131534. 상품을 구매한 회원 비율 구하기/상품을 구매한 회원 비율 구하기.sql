# 2021년에 가입한 전체 회원들 중 
# 상품을 구매한 회원수와 
# 상품을 구매한 회원의 비율(=2021년에 가입한 회원 중 상품을 구매한 회원수 / 2021년에 가입한 전체 회원 수)을 소수점 두번째자리에서 반올림
# 년, 월별로 출력
# 전체 결과는 년을 기준으로 오름차순 정렬해주시고 년이 같다면 월을 기준으로 오름차순 정렬

#1-158
# SELECT * from user_info as u where year(u.joined) = 2021

# select * from online_sale as o where user_id between 1 and 158 order by sales_date

# select year(o.sales_date)as "year", month(o.sales_date) as "month", count(o.user_id) as PUCHASED_USERS
# from online_sale as o 
# where o.user_id between 1 and 158 
# group by year, month
# order by o.sales_date

select year(o.sales_date)as "year", month(o.sales_date) as "month", 
        count(distinct o.user_id) as PUCHASED_USERS,
        round(count(distinct o.user_id)/(SELECT count(user_id) from user_info where year(joined) = 2021),1) as PUCHASED_RATIO
from user_info as u join ONLINE_SALE as o on u.user_id=o.user_id
where year(u.joined) = 2021
group by year, month
order by year, month
# where는 행 기준으로 조건 적용, having은 group by로 나눈 후 조건을 거는 거다.
# group by에 열을 두 개 쓸 수도 있다.
SELECT USER_ID, PRODUCT_ID
from ONLINE_SALE
group by USER_ID, PRODUCT_ID
having count(*)>=2
order by USER_ID, PRODUCT_ID desc
SELECT substr(PRODUCT_CODE,1,2) as CATEGORY, count(product_id) as PRODUCTS
from product
group by substr(PRODUCT_CODE,1,2) 
order by substr(PRODUCT_CODE,1,2)

# MySQL substring
# substr(문자열, 시작위치) = substr(문자열 from 시작위치)
# substr(문자열, 시작위치, 읽을 글자 수) = substr(문자열 from 시작위치 for 읽을 글자 수)

# --  5번째부터 읽기
# substr('string',5) = substr('string' from 5)

# -- 첫번째부터 3개 읽기
# substr('string', 1, 3) = substr('string' from 1 for 3)

# -- 뒤에서 첫번째부터 읽기
# substr('string', -1) = substr('string' from -1)

# -- 뒤에서 첫번째부터 3개 읽기
# substr('string', -1, 3) = substr('string' from -1 for 3)

# 참고: https://needjarvis.tistory.com/64
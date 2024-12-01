# IFNULL
# 해당 Column의 값이 NULL을 반환할 때, 다른 값으로 출력할 수 있도록 하는 함수
# SELECT IFNULL(Column명, "Null일 경우 대체 값") FROM 테이블명; 

# // NAME Column이 NULL이 True인 경우 "No name"을, False인 경우는 NAME Column을 출력
# SELECT IF(IS NULL(NAME), "No name", NAME) as NAME
# FROM ANIMAL_INS


# CASE
# 해당 Column 값을 조건식을 통해 True, False를 판단하여 조건에 맞게 Column값을 변환할 때 사용하는 함수이다.
# CASE 
#     WHEN 조건식1 THEN 식1
#     WHEN 조건식2 THEN 식2
#     ...
#     ELSE 조건에 맞는경우가 없는 경우 실행할 식
# END


# COALESCE
# 지정한 표현식들 중에 NULL이 아닌 첫 번째 값을 반환한다.
# 모든 DBMS에서 사용가능
# 표현식은 여러 항목 지정이 가능하고, 처음으로 만나는 NULL이 아닌 값을 출력한다.
# 표현식이 모두 NULL일 경우엔 결과도 NULL 반환
# COALESCE는 배타적 OR 관계 열에서 활용도가 높다.
# 엔터티(테이블)에서 두 개 이상의 속성(열) 중 하나의 값만 가지는 데이터일 경우

# 기본 구조
# // NULL 처리 상황
# SELECT COALESCE(Column명1, Column명1이 NULL인 경우 대체할 값)
# FROM 테이블명

# // 배타적 OR 관계 열
# // Column1 ~ 4 중 NULL이 아닌 첫 번째 Column을 출력
# SELECT COALESCE(Column명1, Column명2, Column명3, Column명4)
# FROM 테이블명

# 출처: https://velog.io/@gillog/DB-MySQL-NULL-%EC%B2%98%EB%A6%ACIFNULL-CASE-COALESCE

SELECT WAREHOUSE_ID, WAREHOUSE_NAME, address, ifnull(FREEZER_YN,'N') as FREEZER_YN
from FOOD_WAREHOUSE
where address like '경기도%'
order by warehouse_id asc
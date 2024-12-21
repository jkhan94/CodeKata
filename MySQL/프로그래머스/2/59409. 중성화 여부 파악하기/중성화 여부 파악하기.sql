# if(조건, '참', '거짓')
# ifnull(컬럼명, null일 때 출력할 값)
# isnull(컬럼명, null일 때 출력할 값)

# case when 조건1 then '값1'
#        when 조건2 then '값2'
#        else '값3'
# end

# nvl(null이 아닐때 출력할 컬럼명, null일 때 출력할 값)

# 출처: https://velog.io/@pm1100tm/MySQL-%EC%A1%B0%EA%B1%B4%EB%AC%B8-%EC%A0%95%EB%A6%AC

SELECT animal_id, name, if(SEX_UPON_INTAKE like '%Neutered%' or SEX_UPON_INTAKE like'%Spayed%','O', 'X') as 중성화
from animal_ins
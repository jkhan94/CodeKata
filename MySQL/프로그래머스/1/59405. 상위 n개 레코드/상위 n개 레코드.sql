-- 오라클: SELECT NAME FROM (SELECT * FROM ANIMAL_INS ORDER BY DATETIME) WHERE rownum = 1;
-- MySQL: limit a, b : a~b까지 출력
SELECT name
from animal_ins
order by datetime
limit 1
# date_format 참고: https://devjhs.tistory.com/89

SELECT animal_id, name, date_format(datetime, '%Y-%m-%d') as 날짜
from animal_ins
order by animal_id
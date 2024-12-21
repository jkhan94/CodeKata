-- 코드를 입력하세요
SELECT ins.name, ins.datetime
from animal_ins as ins
where ins.animal_id not in (select animal_id from animal_outs)
order by ins.datetime
limit 3
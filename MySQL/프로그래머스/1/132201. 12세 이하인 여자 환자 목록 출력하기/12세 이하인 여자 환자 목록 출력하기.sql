SELECT PT_NAME, PT_NO, GEND_CD, age, ifnull(tlno,'NONE')
from patient
where age <=12 and GEND_CD like 'W'
order by age desc, PT_NAME asc
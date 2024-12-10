SELECT date_format(datetime, '%H')as HOUR,count(animal_id) as COUNT
from animal_outs
group by hour
having hour between 9 and 19
order by hour
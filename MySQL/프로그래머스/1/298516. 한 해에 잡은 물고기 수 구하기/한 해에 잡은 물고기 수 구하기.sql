select count(id) as FISH_COUNT
from fish_info
where year(date(TIME)) = 2021 

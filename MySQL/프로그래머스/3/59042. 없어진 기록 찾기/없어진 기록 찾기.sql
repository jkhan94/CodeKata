SELECT o.animal_id, o.name
from animal_ins as i right join animal_outs as o on i.animal_id=o.animal_id
where i.datetime is null
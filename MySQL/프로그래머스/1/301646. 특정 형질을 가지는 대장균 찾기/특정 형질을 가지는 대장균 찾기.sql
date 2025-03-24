-- x and 1 = x
-- x or 0 = x
select count(id) as count
from ECOLI_DATA
where genotype&2!=2 and (genotype&1=1 or genotype&4=4)

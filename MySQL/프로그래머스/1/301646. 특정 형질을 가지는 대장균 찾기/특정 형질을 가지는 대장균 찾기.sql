-- x and 1 = x
-- x or 0 = x
-- 1형질=1, 2형질=2, 3형질=4, 4형질=8
select count(id) as count
from ECOLI_DATA
where genotype&2!=2 and (genotype&1=1 or genotype&4=4)
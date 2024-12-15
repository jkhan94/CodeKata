SELECT u.user_id, u.nickname, sum(b.price) as TOTAL_SALES
from USED_GOODS_BOARD as b join USED_GOODS_USER as u on b.writer_id=u.user_id
where b.status like "DONE" 
group by u.user_id
having TOTAL_SALES>=700000
order by TOTAL_SALES

# SELECT u.user_id, u.nickname, sum(b.price) as TOTAL_SALES
# from USED_GOODS_BOARD as b join USED_GOODS_USER as u on b.writer_id=u.user_id
# where b.status like "DONE" 
# having sum(b.price)>=700000
# order by TOTAL_SALES
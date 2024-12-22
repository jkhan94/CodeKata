# SQL> REGEXP_REPLACE('01012345678', '(02|.{3})(.+)(.{4})', '\\1-\\2-\\3');
SELECT u.user_id, u.nickname,
        concat(u.city, ' ', u.street_address1, ' ' ,u.street_address2) as "전체주소", 
        concat(left(u.TLNO,3),'-',substring(u.TLNO,4,4),'-',right(u.TLNO, 4)) as "전화번호"
from USED_GOODS_BOARD as b join USED_GOODS_USER as u on b.WRITER_ID=u.user_id
group by b.writer_id
having count(b.board_id)>=3
order by u.user_id desc
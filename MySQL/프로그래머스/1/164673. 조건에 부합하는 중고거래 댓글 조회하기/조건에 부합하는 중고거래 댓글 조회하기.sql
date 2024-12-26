SELECT b.title, b.board_id, r.reply_id, 
        r.writer_id, r.contents, 
        date_format(r.created_date, "%Y-%m-%d") as created_date
from USED_GOODS_BOARD as b join USED_GOODS_REPLY as r on b.board_id=r.board_id
where b.created_date like "2022-10%"
order by r.created_date, b.title
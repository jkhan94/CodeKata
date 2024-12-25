SELECT concat("/home/grep/src/",f.board_id,"/",f.file_id,f.FILE_NAME,f.FILE_EXT) as FILE_PATH
from USED_GOODS_BOARD as b join USED_GOODS_FILE as f on b.board_id=f.board_id
where b.views = (select max(views) from USED_GOODS_BOARD )
order by f.file_id desc
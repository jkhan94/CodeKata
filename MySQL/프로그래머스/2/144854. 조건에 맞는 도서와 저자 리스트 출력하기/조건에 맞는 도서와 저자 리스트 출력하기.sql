SELECT b.book_id, a.author_name, date_format(b.PUBLISHED_DATE,'%Y-%m-%d')
from book as b join author as a on b.author_id = a.author_id
where b.CATEGORY like "경제"
order by b.PUBLISHED_DATE
SELECT a.AUTHOR_ID, a.AUTHOR_NAME, b.category, sum(s.sales*b.price)as total_sales
from book as b 
    join book_sales as s on b.book_id=s.book_id
    join author as a on b.author_id=a.author_id
 where s.SALES_DATE like "2022-01%"
group by a.AUTHOR_ID,b.category
order by a.AUTHOR_ID,b.category desc


# SELECT a.AUTHOR_ID, a.AUTHOR_NAME, b.category, (s.sales*b.price) as total_sales
# from book as b 
#     join book_sales as s on b.book_id=s.book_id
#     join author as a on b.author_id=a.author_id
# where s.SALES_DATE like "2022-01%"
# group by a.author_id, b.category
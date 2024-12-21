-- sales 테이블에서 먼저 책 아이디별 판매량을 구함
# SELECT sum(sales) as total_sales
# from book_sales as sales
# where date_format(sales_date,'%Y') =2022 and date_format(sales_date,'%m') = 01
# group by book_id
# order by book_id, sales_date

-- book과 조인해서 카테고리별 정렬
SELECT book.category, sum(sales.sales) as total_sales
from book_sales as sales join book on sales.book_id = book.book_id
where date_format(sales.sales_date,'%Y') =2022 and date_format(sales.sales_date,'%m') = 01
group by book.category
order by book.category
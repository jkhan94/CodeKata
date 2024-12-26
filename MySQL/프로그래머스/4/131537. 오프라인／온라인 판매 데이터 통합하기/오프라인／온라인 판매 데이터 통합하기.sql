SELECT date_format(SALES_DATE,"%Y-%m-%d")as sales_date,	
        PRODUCT_ID,	       
        USER_ID, 
        SALES_AMOUNT
from ONLINE_SALE
where sales_date like "2022-03%"

union

select date_format(SALES_DATE,"%Y-%m-%d")as sales_date,	
        PRODUCT_id,
        null as user_id, 
        SALES_AMOUNT
from OFFLINE_SALE
where sales_date like "2022-03%"
order by sales_date, product_id, user_id
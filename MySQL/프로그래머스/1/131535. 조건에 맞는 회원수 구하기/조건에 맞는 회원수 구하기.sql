# SELECT count(user_id)
# from user_info
# where age between 20 and 29 and date_format(joined,'%Y') = '2021'

# SELECT count(user_id)
# from user_info
# where age between 20 and 29 and date_format(joined,'%Y') like '2021%'

SELECT COUNT(user_id) as users 
FROM user_info 
WHERE YEAR(joined) = '2021' AND age >= 20 AND age <= 29;


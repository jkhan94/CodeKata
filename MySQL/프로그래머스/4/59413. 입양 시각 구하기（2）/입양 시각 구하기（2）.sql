# 7~19시까지만 데이터가 있다. 없는 데이터를 만들어야 한다.
SET @HOUR = -1; #hour=-1; 다른 곳에서 등호는 := 으로 써야 한다.
SELECT (@HOUR := @HOUR +1) AS HOUR,
    (SELECT COUNT(HOUR(DATETIME)) 
    FROM ANIMAL_OUTS 
    WHERE HOUR(DATETIME)=@HOUR) AS COUNT 
    FROM ANIMAL_OUTS
WHERE @HOUR < 23;

# SELECT hour(datetime) as hour, count(animal_id) as count
# from animal_outs
# where hour(datetime) between 0 and 23
# group by hour(datetime)
# order by hour(datetime)
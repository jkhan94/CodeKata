-- SUBSTRING_INDEX(str,delim,count): 구분자 (delimiter) delim가 count 만큼 나오면 delim 전까지 str 잘라서 리턴.

-- 복수개의 특정 문자를 포함하는 데이터 검색 (특정 문자열을 '|' 를 기준으로 나눈다)
-- SELECT [필드명] FROM [테이블명] WHERE [필드명] REGEXP '특정 문자열|특정 문자열2';

-- select *
-- from users
-- where mail regexp '^[A-Za-z][A-Za-z0-9_.-]*@leetcode[.]com$'

SELECT
  *
FROM
  Users
WHERE
  mail REGEXP '^[a-zA-Z][a-zA-Z0-9_.-]*@leetcode[.]com$';
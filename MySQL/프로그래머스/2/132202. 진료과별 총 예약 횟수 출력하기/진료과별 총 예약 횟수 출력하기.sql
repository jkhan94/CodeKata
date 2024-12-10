SELECT MCDP_CD as 진료과코드, count(apnt_no)as 5월예약건수
from appointment
where month(APNT_YMD)=5 
group by 진료과코드
order by 5월예약건수, 진료과코드
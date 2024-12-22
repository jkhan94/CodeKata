SELECT a.apnt_no, p.pt_name, p.PT_NO, a.MCDP_CD, d.dr_name, a.apnt_ymd
from appointment as a
    join doctor as d on d.DR_ID=a.MDDR_ID
    join PATIENT as p on p.PT_NO=a.PT_NO
where a.APNT_YMD like "2022-04-13%" and a.APNT_CNCL_YN like "N" and a.MCDP_CD like "CS"
order by a.APNT_YMD
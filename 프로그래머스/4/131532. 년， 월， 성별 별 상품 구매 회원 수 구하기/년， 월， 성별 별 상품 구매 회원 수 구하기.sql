-- 코드를 입력하세요
SELECT YEAR(S.sales_date) AS YEAR,
       MONTH(S.sales_date) AS MONTH,
       I.GENDER AS GENDER,
       COUNT(DISTINCT S.USER_ID) AS USERS
FROM ONLINE_SALE S LEFT JOIN USER_INFO I
ON S.USER_ID = I.USER_ID
GROUP BY YEAR(S.sales_date),MONTH(S.sales_date),I.GENDER
HAVING GENDER IS NOT NULL
ORDER BY YEAR(S.sales_date),MONTH(S.sales_date),I.GENDER;
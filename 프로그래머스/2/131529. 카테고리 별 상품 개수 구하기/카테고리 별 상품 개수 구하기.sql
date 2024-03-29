-- 코드를 입력하세요
SELECT LEFT(PRODUCT_CODE,2) AS CATEGORY,
(SELECT COUNT(PRODUCT_ID) FROM PRODUCT WHERE PRODUCT_CODE LIKE CONCAT(CATEGORY,'%')) AS PRODUCTS
FROM PRODUCT
GROUP BY CATEGORY
ORDER BY CATEGORY;
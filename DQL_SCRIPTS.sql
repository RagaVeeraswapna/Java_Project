/*  
	Author Sangeeta Palankar
    date 28/12/2022
    DQL SCRIPTS
*/
SELECT LOGIN_ID,
NAME,
EMAIL,
PHONE_NO,
ADDRESS,
DATE_OF_BIRTH ,
TIMESTAMPDIFF(YEAR, DATE_OF_BIRTH , CURDATE()) AS age,
ID_PROOF,
PASSWORD
FROM USER;

SELECT ORDER_ID, PRODUCT_NAME, QUANTITY, TOTAL_PRICE, STATUS
FROM ORDER_DETAILS;

SELECT PRODUCT_ID, 
PRODUCT_NAME, 
PRODUCT_COUNT, 
TOTAL_STOCK, 
BEST_BEFORE
FROM PRODUCT;

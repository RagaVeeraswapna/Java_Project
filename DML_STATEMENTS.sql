/*  
	Author Veera Swapna Raga
    date 28/12/2022
    DML_STATEMENTS
*/

use kbms_project;
INSERT INTO USER
(NAME, EMAIL, PHONE_NO, ADDRESS, DATE_OF_BIRTH,ID_PROOF,LOGIN_ID,PASSWORD)
VALUES
("Sangeeta Palankar","sangita123@gmail.com","9845624525","Belgaum","2000-10-18","Aadhar card","sangita123@gmail.com","qwfsrt56"),
("Veera Swapna Raga","swapnaraga6@gmail.com","8234567890","kadapa","2001-09-05","pan card","swapnaraga6@gmail.com","Veera"),
("swapna","swapna@gmail.com",7234567892,"vijayawada","2001-06-11","Aadhar card","swapna@gmail.com","123456"),
("raju","raju@gmail.com",7216545545,"banglore","2000-05-10","pan card","raju@gmail.com","15465"),
("harika","harika@gmail.com",1455651255,"hyderabad","1998-02-15","passport","harika@gmail.com","dbd4212");


INSERT INTO PRODUCT 
(PRODUCT_NAME, PRICE_PER_UNIT, PRODUCT_COUNT, TOTAL_STOCK, BEST_BEFORE)
VALUES
("PRODUCT_1",30,2,50,'2023-03-23'),
("PRODUCT_2",100,10,100,'2023-03-15');

DELETE FROM  ORDER_DETAILS;
INSERT INTO ORDER_DETAILS
(PRODUCT_NAME,QUANTITY,TOTAL_PRICE,LOGIN_ID)
VALUES 
("PRODUCT_1",5,(SELECT QUANTITY*PRICE_PER_UNIT FROM PRODUCT WHERE PRODUCT_ID=2),"swapnaraga6@gmail.com");
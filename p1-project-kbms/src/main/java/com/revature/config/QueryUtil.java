package com.revature.config;


public class QueryUtil {
	public static final String INSERT_QUERY = "INSERT INTO `KBMS`.`PRODUCT` (`LOGIN_ID`,`PASSWORD`,`LAST_MODIFIED`) VALUES (?,?,?) ";
	public static final String query = "INSERT INTO  `KBMS`.`PRODUCT`(PRODUCT_ID, PRODUCT_NAME, PRODUCT_COUNT, TOTAL_STOCK, BEST_BEFORE, PRICE_PER_UNIT) VALUES (?,?,?,?,?,?)";

	public static String insertAdmin() {
		return "INSERT INTO  `Product`(PRODUCT_ID, PRODUCT_NAME, PRODUCT_COUNT, TOTAL_STOCK, BEST_BEFORE, PRICE_PER_UNIT) VALUES (?,?,?,?,?,?)";
	}

	public static String selectAllProducts() {
		return "SELECT * FROM Product";
	}


public static String selectProById(int id) {
	return "SELECT * FROM `KBMS`.`Product` WHERE PRODUCT_ID ='"+id+"'";
}
public static final String SELECT_QUERY = "SELECT * FROM PRODUCT WHERE PRODUCT_ID = ? ";
public static String updateName(int n,String newName) {
	return "UPDATE PRODUCT SET PRODUCT_NAME ='"+newName+"' WHERE PRODUCT_ID='"+n+"'";
}
public static String updateProductCount(int id,int newCount) {
	return "UPDATE PRODUCT SET PRODUCT_COUNT ='"+newCount+"' WHERE PRODUCT_ID='"+id+"'";
}
public static String updateTotalStock(int id,int newStock) {
	return "UPDATE PRODUCT SET phone ='"+newStock+"' WHERE PRODUCT_ID='"+id+"'";
}
public static String updateBestBefore(int id,int newBest) {
	return "UPDATE PRODUCT SET address ='"+newBest+"' WHERE PRODUCT_ID='"+id+"'";
}
public static String updatePricePerUnit(int id,int newPPU) {
	return "UPDATE PRODUCT SET PRICE_PER_UNIT ='"+newPPU+"' WHERE PRODUCT_ID='"+id+"'";
}
//public static String updateAge(String id,String newAge) {
//	return "UPDATE Customer SET age ='"+newAge+"' WHERE PRODUCT_ID='"+id+"'";
//}
//public static String chechAdmin() {
//	return "SELECT * FROM Customer WHERE preferred_login_id = ? + AND password = ? ";
//}
}
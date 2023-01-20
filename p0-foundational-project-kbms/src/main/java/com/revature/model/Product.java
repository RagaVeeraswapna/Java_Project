package com.revature.model;

public class Product {
	private int productId;
	private String productName;
	private int productCount;
	private String totalStock;
	private String thresholdLevel;
	private String bestBefore;
	private double pricePerunit;
	private String typeOfProduct;
	
	public Product(int productId, String productName, int productCount, String totalStock, String thresholdLevel,
			String bestBefore, double pricePerunit, String typeOfProduct) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCount = productCount;
		this.totalStock = totalStock;
		this.thresholdLevel = thresholdLevel;
		this.bestBefore = bestBefore;
		this.pricePerunit = pricePerunit;
		this.typeOfProduct = typeOfProduct;
		
		
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductCount() {
		return productCount;
	}

	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}

	public String getTotalStock() {
		return totalStock;
	}

	public void setTotalStock(String totalStock) {
		this.totalStock = totalStock;
	}

	public String getThresholdLevel() {
		return thresholdLevel;
	}

	public void setThresholdLevel(String thresholdLevel) {
		this.thresholdLevel = thresholdLevel;
	}

	public String getBestBefore() {
		return bestBefore;
	}

	public void setBestBefore(String bestBefore) {
		this.bestBefore = bestBefore;
	}

	public double getPricePerunit() {
		return pricePerunit;
	}

	public void setPricePerunit(double pricePerunit) {
		this.pricePerunit = pricePerunit;
	}

	public String getTypeOfProduct() {
		return typeOfProduct;
	}

	public void setTypeOfProduct(String typeOfProduct) {
		this.typeOfProduct = typeOfProduct;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productCount=" + productCount
				+ ", totalStock=" + totalStock + ", thresholdLevel=" + thresholdLevel + ", bestBefore=" + bestBefore
				+ ", pricePerunit=" + pricePerunit + ", typeOfProduct=" + typeOfProduct + "]";
	}
	
	
}
package com.revature.model;

public class Order {
	private int orderId;
	private String loginId;
	private int productId;
	private String productName;
	private String quantity;
	private double totalprice;
	private String OrderDate;
	private String CancellationId;
	private String CancellationDate;
	private String CancellationReason;
	private String status;
	public Order(int orderId, String loginId, int productId, String productName, String quantity, double totalprice,
			String orderDate, String cancellationId, String cancellationDate, String cancellationReason,
			String status) {
		super();
		this.orderId = orderId;
		this.loginId = loginId;
		this.productId = productId;
		this.productName = productName;
		this.quantity = quantity;
		this.totalprice = totalprice;
		this.OrderDate = orderDate;
		this.CancellationId = cancellationId;
		this.CancellationDate = cancellationDate;
		this.CancellationReason = cancellationReason;
		this.status = status;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
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
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public double getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}
	public String getOrderDate() {
		return OrderDate;
	}
	public void setOrderDate(String orderDate) {
		OrderDate = orderDate;
	}
	public String getCancellationId() {
		return CancellationId;
	}
	public void setCancellationId(String cancellationId) {
		CancellationId = cancellationId;
	}
	public String getCancellationDate() {
		return CancellationDate;
	}
	public void setCancellationDate(String cancellationDate) {
		CancellationDate = cancellationDate;
	}
	public String getCancellationReason() {
		return CancellationReason;
	}
	public void setCancellationReason(String cancellationReason) {
		CancellationReason = cancellationReason;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", loginId=" + loginId + ", productId=" + productId + ", productName="
				+ productName + ", quantity=" + quantity + ", totalprice=" + totalprice + ", OrderDate=" + OrderDate
				+ ", CancellationId=" + CancellationId + ", CancellationDate=" + CancellationDate
				+ ", CancellationReason=" + CancellationReason + ", status=" + status + "]";
	}
	
	
	
	
	
}
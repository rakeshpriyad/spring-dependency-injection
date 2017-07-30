package com.stundent.spring.dependency.injection;

public class Product {
	
	private Category category;
	private String productId;
	private String productName;
	private Price prodPrice;
	
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Price getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(Price prodPrice) {
		this.prodPrice = prodPrice;
	}
}

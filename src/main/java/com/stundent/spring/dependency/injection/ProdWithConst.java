package com.stundent.spring.dependency.injection;

public class ProdWithConst {
	private Category category;
	private String productId;
	private String productName;
	private Price prodPrice;
	
	public ProdWithConst(Category category, String productId, String productName, Price prodPrice) {
		super();
		this.category = category;
		this.productId = productId;
		this.productName = productName;
		this.prodPrice = prodPrice;
	}

	public Category getCategory() {
		return category;
	}

	public String getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public Price getProdPrice() {
		return prodPrice;
	}
	
}

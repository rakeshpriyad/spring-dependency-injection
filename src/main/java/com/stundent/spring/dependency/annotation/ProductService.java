package com.stundent.spring.dependency.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductService {
	private int prodId;
	private String pName;
	
	//@Autowired
	public ProductService(ProductDAO productDAOs){
		this.productDAOs = productDAOs;
	}
	
	//@Autowired
	ProductDAO productDAOs;

	@Override
	public String toString() {
		return "ProductService [productDAO=" + productDAOs + "]";
	}

	public ProductDAO getProductDAO() {
		return productDAOs;
	}

	//@Autowired
	public void setProductDAO(ProductDAO productDAO) {
		this.productDAOs = productDAO;
	}

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}
}

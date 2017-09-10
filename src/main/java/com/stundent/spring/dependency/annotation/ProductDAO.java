package com.stundent.spring.dependency.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductDAO {
	@Autowired
	private Product product;
	
	@Override
	public String toString() {
		return "Hello , This is ProductDAO";
	}
	
	public Product getProduct(){
		product.setProductId("P001");
		product.setProductName("Pencil");
		return product;
	}
	
	
}

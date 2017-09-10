package com.stundent.spring.dependency.injection.staticfactory;

import com.stundent.spring.dependency.injection.Product;

public class ProductService {
	//private static ProductService clientService = new ProductService();
	//private static Product product;

	private ProductService() {
	}

	public static Product createInstance() {
		Product product = new Product();
		product.setProductId("P001");
		product.setProductName("Pen");
		return product;
	}
}
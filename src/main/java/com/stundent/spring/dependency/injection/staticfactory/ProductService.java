package com.stundent.spring.dependency.injection.staticfactory;

import com.stundent.spring.dependency.injection.Product;

public class ProductService {
	private static ProductService clientService = new ProductService();
	private Product product;

	private ProductService() {
	}

	public static ProductService createInstance() {
		return clientService;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
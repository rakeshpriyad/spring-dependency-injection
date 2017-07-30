package com.stundent.spring.dependency.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductService {
	@Autowired
	ProductDAO productDAO;

	@Override
	public String toString() {
		return "ProductService [productDAO=" + productDAO + "]";
	}

}

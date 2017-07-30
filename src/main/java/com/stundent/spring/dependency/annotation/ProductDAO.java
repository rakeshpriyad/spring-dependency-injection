package com.stundent.spring.dependency.annotation;

import org.springframework.stereotype.Component;

@Component
public class ProductDAO {
	@Override
	public String toString() {
		return "Hello , This is ProductDAO";
	}
}

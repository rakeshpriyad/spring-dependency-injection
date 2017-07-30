package com.stundent.spring.dependency.injection.staticfactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.stundent.spring.dependency.injection.Product;

public class DIStaticFactoryDemo {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config-static-fact.xml");

		ProductService productService = (ProductService) context.getBean("prodService");
		Product prod= productService.getProduct();
		
		System.out.println(prod.getProductId());
		System.out.println(prod.getProductName());
		System.out.println(prod.getCategory().getCategoryId());
		System.out.println(prod.getCategory().getCategoryName());
		System.out.println(prod.getCategory().getDetails().getDescription());
	}
}

package com.stundent.spring.dependency.injection.staticfactory;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.stundent.spring.dependency.injection.Product;

public class DIStaticFactoryDemo {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring-config-static-fact.xml");

		Product prod = (Product) context.getBean("prod");
		//Product prod = productService.getProduct();

		System.out.println(prod.getProductId());
		System.out.println(prod.getProductName());
		
		context.close();
	}
}

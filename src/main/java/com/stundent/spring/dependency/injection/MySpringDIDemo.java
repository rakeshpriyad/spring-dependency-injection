package com.stundent.spring.dependency.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringDIDemo {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

		Product prod = (Product) context.getBean("prod");
		
		System.out.println(prod.getProductId());
		System.out.println(prod.getProductName());
		System.out.println(prod.getCategory().getCategoryId());
		System.out.println(prod.getCategory().getCategoryName());
		System.out.println(prod.getCategory().getDetails().getDescription());
		
		System.out.println(prod.getProdPrice().getPrice());
		
	}
}

package com.stundent.spring.dependency.injection;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringDIConstructorDemo {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

		ProdWithConst prod = (ProdWithConst) context.getBean("prodWithConst");

		System.out.println(prod.getProductId());
		System.out.println(prod.getProductName());
		System.out.println(prod.getCategory().getCategoryId());
		System.out.println(prod.getCategory().getCategoryName());
		System.out.println(prod.getCategory().getDetails().getDescription());

		System.out.println(prod.getProdPrice().getPrice());
		context.close();
	}
}

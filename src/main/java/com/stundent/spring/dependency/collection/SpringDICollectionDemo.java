package com.stundent.spring.dependency.collection;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDICollectionDemo {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring-config-collections.xml");

		Customer cust = (Customer) context.getBean("CustomerBean");
		System.out.println(cust);
		context.close();

	}
}
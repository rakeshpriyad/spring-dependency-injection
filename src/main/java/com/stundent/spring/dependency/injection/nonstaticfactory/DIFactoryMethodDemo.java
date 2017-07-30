package com.stundent.spring.dependency.injection.nonstaticfactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.stundent.spring.dependency.injection.Category;

public class DIFactoryMethodDemo {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config-nonstatic-fact.xml");

		Category category = (Category) context.getBean("cat");
		System.out.println(category.getCategoryId());
		System.out.println(category.getCategoryName());
	}
}

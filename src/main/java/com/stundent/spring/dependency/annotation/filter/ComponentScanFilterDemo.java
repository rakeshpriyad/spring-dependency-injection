package com.stundent.spring.dependency.annotation.filter;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComponentScanFilterDemo {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "spring-config-component-scan-filter.xml" });

		CategoryService category = (CategoryService) context.getBean("categoryService");
		System.out.println(category);
		context.close();
	}
}
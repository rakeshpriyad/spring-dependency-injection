package com.stundent.spring.dependency.annotation;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComponentScanDemo {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "spring-config-component-scan.xml" });

		ProductService prod = (ProductService) context.getBean("productService");
		System.out.println(prod);
		context.close();
	}
}
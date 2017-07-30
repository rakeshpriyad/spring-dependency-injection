package com.stundent.spring.dependency.lifecycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitDestroyDemo {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "spring-config-init-destroy.xml" });

		ItemService item = (ItemService) context.getBean("itemService");

		System.out.println(item);

		context.close();
	}
}
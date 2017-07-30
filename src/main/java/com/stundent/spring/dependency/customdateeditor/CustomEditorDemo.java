package com.stundent.spring.dependency.customdateeditor;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomEditorDemo {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "spring-config-customeditor.xml" });

		User cust = (User) context.getBean("user");
		System.out.println(cust);
		context.close();
	}
}
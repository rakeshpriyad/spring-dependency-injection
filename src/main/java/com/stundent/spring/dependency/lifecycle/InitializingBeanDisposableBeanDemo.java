package com.stundent.spring.dependency.lifecycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitializingBeanDisposableBeanDemo {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "spring-config-init-bean.xml" });

		UserService user = (UserService) context.getBean("userService");

		System.out.println(user);

		context.close();
	}
}
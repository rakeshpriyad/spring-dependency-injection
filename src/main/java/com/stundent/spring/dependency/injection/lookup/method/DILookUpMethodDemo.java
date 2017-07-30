package com.stundent.spring.dependency.injection.lookup.method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DILookUpMethodDemo {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config-lookup-method.xml");

		Singleton singleton1 = (Singleton) context.getBean("singleton");
		Singleton singleton2 = (Singleton) context.getBean("singleton");
		Singleton singleton3 = (Singleton) context.getBean("singleton");
		
		singleton1.doSomething();
		singleton1.doSomethingElse();
		
		ConfigurableApplicationContext  cntex=(ConfigurableApplicationContext)context;
		cntex.registerShutdownHook();
	}
}

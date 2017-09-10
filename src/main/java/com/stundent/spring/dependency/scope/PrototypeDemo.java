package com.stundent.spring.dependency.scope;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrototypeDemo {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "spring-config-scope-prototype.xml" });
		EmpService empA = (EmpService) context.getBean("empService");
		//empA.setMessage("Message by empA");
		//System.out.println("Message : " + empA.getMessage());

		// retrieve it again
		EmpService empB = (EmpService) context.getBean("empService");
	//	System.out.println("Message : " + empB.getMessage());
		context.close();
	}
}
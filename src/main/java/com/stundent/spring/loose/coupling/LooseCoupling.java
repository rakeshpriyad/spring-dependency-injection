package com.stundent.spring.loose.coupling;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LooseCoupling {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "spring-config-loose-coupling.xml" });

		OutputHelperSpringWay output = (OutputHelperSpringWay) context.getBean("OutputHelper");
		output.generateOutput();
		context.close();
	}
}
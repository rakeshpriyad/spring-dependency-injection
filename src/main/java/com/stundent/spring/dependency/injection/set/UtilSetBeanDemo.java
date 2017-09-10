package com.stundent.spring.dependency.injection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UtilSetBeanDemo {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("Ram");
		set.add("Ramu");
		set.add("Ram1");
		set.add("Ram3");
		Iterator it= set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "spring-config-utilset.xml" });

		MyBean bean = (MyBean) context.getBean("myBean");
		it= bean.getSets().iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		//System.out.println(bean);
		context.close();
	}
}
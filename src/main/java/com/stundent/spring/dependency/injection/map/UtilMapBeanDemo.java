package com.stundent.spring.dependency.injection.map;

import java.util.Hashtable;
import java.util.Map;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UtilMapBeanDemo {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "spring-config-utilmap.xml" });

		MyBean bean = (MyBean) context.getBean("myBean");
		System.out.println(bean);
		
		Map<String,String> hashTable = new Hashtable<String, String>();
		hashTable.put("XX","XXXX");
		hashTable.put("YY","YYYY");
		hashTable.put("ZZ","ZZZ");
		for(Map.Entry<String,String> e: hashTable.entrySet()){
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		context.close();
	}
}
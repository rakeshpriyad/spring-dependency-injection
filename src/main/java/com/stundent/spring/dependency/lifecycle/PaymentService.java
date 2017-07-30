package com.stundent.spring.dependency.lifecycle;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@SuppressWarnings("restriction")
public class PaymentService  {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
	@PostConstruct
	public void initIt() throws Exception {
		System.out.println("Init method after properties are set : " + message);
	}

	@PreDestroy
	public void cleanUp() throws Exception {
		System.out.println("Spring Container is destroy! Payment clean up");
	}

}
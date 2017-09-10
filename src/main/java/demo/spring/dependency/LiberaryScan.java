package demo.spring.dependency;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LiberaryScan {

	public static void main(String[] args) {
ConfigurableApplicationContext context=new ClassPathXmlApplicationContext(new String[] {"spring-config-scan.xml"});
LiberaryService libServ=(LiberaryService) context.getBean("liberaryService");
LiberaryDAO libDAO=libServ.getLiberaryDAO();
Liberary lib=libDAO.getLiberary();

	}

}

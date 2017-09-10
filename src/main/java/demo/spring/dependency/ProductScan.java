package demo.spring.dependency;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductScan {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] {"spring-config-scan.xml"});
		ProductService prodServ = (ProductService) context.getBean("productService");
		ProductDAO prodDAO = prodServ.getProductDAO();
		Product prod = prodDAO.getProduct();
		System.out.println(prod.getpId());
		System.out.println(prod.getpName());
		System.out.println(prod.getType());
		System.out.println(prod.getPrice());
		System.out.println(prod.getCategory().getCatId());
		System.out.println(prod.getCategory().getCatName());
		System.out.println(prod.getCategory().getcType());
	}

}

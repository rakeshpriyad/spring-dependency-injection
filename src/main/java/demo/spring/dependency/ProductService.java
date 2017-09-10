package demo.spring.dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductService {
ProductDAO productDAO;
@Autowired
public ProductService(ProductDAO productDAO){
	this.productDAO=productDAO;
	
}
public ProductDAO getProductDAO() {
	return productDAO;
}
public void setProductDAO(ProductDAO productDAO) {
	this.productDAO = productDAO;
}
}
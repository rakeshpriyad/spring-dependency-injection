package demo.spring.dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductDAO {
@Autowired
private Product product;
public Product getProduct() {
	product.setpId(4);
	product.setpName("Rice");
	product.setType("fooding Item");
	product.setPrice("24");
	product.getCategory().setCatId(1);
	product.getCategory().setCatName("CCC");
	product.getCategory().setcType("ffff");
	return product;
}
public void setProduct(Product product) {
	this.product = product;
}

}

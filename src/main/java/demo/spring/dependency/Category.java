package demo.spring.dependency;

import org.springframework.stereotype.Component;

@Component
public class Category {
	private int catId;
	private String catName;
	private String cType;
	public int getCatId() {
		return catId;
	}
	public void setCatId(int catId) {
		this.catId = catId;
	}
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}
	public String getcType() {
		return cType;
	}
	public void setcType(String cType) {
		this.cType = cType;
	}

}

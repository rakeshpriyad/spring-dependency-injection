package com.stundent.spring.dependency.injection;

public class Category {
	private String categoryId;
	private String categoryName;
	private CategoryDetails details;
	
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public CategoryDetails getDetails() {
		return details;
	}
	public void setDetails(CategoryDetails details) {
		this.details = details;
	}
}

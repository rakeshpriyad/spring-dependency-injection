package com.stundent.spring.dependency.injection.nonstaticfactory;

import com.stundent.spring.dependency.injection.Category;

public class CategoryFactory {

	private CategoryFactory() {
	}

	public Category createCategory() {
		Category cat = new Category();
		cat.setCategoryId("C001");
		cat.setCategoryName("Pen cat");
		return cat;
	}
}
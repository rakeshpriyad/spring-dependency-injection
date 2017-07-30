package com.stundent.spring.dependency.annotation.filter;

import org.springframework.beans.factory.annotation.Autowired;

public class CategoryService {
	@Autowired
	CategoryDAO categoryDAO;

	@Override
	public String toString() {
		return "CategoryService [categoryDAO=" + categoryDAO + "]";
	}

}

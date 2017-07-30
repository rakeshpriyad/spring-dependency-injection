package com.stundent.spring.dependency.injection.set;

import java.util.Set;

public class MyBean {
	private Set<String> sets;

	public Set<String> getSets() {
		return sets;
	}

	public void setSets(Set<String> sets) {
		this.sets = sets;
	}
}

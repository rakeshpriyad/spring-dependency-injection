package com.stundent.spring.dependency.injection.map;

import java.util.Map;

public class MyBean {
	private Map<String,String> maps;

	public Map<String,String> getMaps() {
		return maps;
	}

	public void setMaps(Map<String,String> maps) {
		this.maps = maps;
	}
}

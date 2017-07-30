package com.stundent.spring.dependency.customdateeditor;

import java.util.Date;

public class Customer {

	private Date date;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Customer [date=" + date + "]";
	}

}
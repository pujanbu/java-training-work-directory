package com.vastika.spring_core_demo;

import org.springframework.beans.factory.annotation.Autowired;

public class User {

	private String userName;
	private Address officeAddress;
	

	public Address getOfficeAddress() {
		return officeAddress;
	}
	
	@Autowired
	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}

	

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void displayUserInfo() {
		System.out.println("user name is:: " + getUserName());
		
		System.out.println("user office city name is:: " + getOfficeAddress().getCityName());
		System.out.println("user office country is:: " + getOfficeAddress().getCountryName());

	}

}

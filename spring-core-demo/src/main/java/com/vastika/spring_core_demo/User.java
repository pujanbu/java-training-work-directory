package com.vastika.spring_core_demo;

public class User {
	// commented if uncommented, works by deleting uncommented code
//	private String userName;
//	private int age;
//	private int mobileNo;

//	public void displayUserInfo() {
//		System.out.println("user name is:: " + getUserName());
//		System.out.println("age is ::" + getAge());
//		System.out.println("user mobile ::" + getMobileNo());
//	}
//
//	public String getUserName() {
//		return userName;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public int getMobileNo() {
//		return mobileNo;
//	}
//
//	public User(String userName, int age, int mobileNo) {
//		this.userName = userName;
//		this.age = age;
//		this.mobileNo= mobileNo;
//	}

	private String userName;
	private Address officeAddress;
	private Address homeAddress;

	public Address getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void displayUserInfo() {
		System.out.println("user name is:: " + getUserName());
		System.out.println("user home city name is:: " + getHomeAddress().getCityName());
		System.out.println("user home country is:: " + getHomeAddress().getCountryName());
		System.out.println("user office city name is:: " + getOfficeAddress().getCityName());
		System.out.println("user office country is:: " + getOfficeAddress().getCountryName());

	}

}

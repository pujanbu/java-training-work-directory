package com.vastika.spring_core_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		
		
		System.out.println("==============================");
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml"); 
		User u = (User) context.getBean("user");
		u.displayUserInfo();
		
	} 
}
 
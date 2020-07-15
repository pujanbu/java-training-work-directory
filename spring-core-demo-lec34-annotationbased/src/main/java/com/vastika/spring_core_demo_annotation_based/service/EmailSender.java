package com.vastika.spring_core_demo_annotation_based.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("emailSender")
//@Primary
public class EmailSender implements MessageSender {

	@Override
	public String sendMessage() {
		return "Email is sent...";
		
	}
	 

}

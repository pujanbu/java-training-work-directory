package com.vastika.spring_core_demo_annotation_based.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.vastika.spring_core_demo_annotation_based.service.MessageSender;

@Component
public class MessageController {
	
	@Value("${message.name}")
	private String name; 


	@Autowired
	@Qualifier("textSender")
	private MessageSender messageSender;

//	@Autowired
//	public void setMessageSender(MessageSender messageSender) {
//		this.messageSender=messageSender;
//	}

	public void send() {
		messageSender.sendMessage();
		System.out.println(messageSender.sendMessage()+" to "+name);
		
	}
}

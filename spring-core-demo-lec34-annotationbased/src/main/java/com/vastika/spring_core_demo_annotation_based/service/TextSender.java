package com.vastika.spring_core_demo_annotation_based.service;

import org.springframework.stereotype.Component;

@Component("textSender")
public class TextSender implements MessageSender {

	@Override
	public String sendMessage() {
		return "Text is sent...";

	}

}

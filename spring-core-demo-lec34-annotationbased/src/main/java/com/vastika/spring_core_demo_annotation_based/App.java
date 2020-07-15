package com.vastika.spring_core_demo_annotation_based;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vastika.spring_core_demo_annotation_based.config.SpringConfig;
import com.vastika.spring_core_demo_annotation_based.controller.MessageController;
import com.vastika.spring_core_demo_annotation_based.service.MessageSender;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		MessageController controller = context.getBean(MessageController.class);
		controller.send();

	} 
}

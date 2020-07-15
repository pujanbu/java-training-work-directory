package com.vastika.spring_core_demo_annotation_based.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

import com.vastika.spring_core_demo_annotation_based.controller.MessageController;
import com.vastika.spring_core_demo_annotation_based.service.EmailSender;
import com.vastika.spring_core_demo_annotation_based.service.MessageSender;

@Configuration
@ComponentScan({ "com.vastika.spring_core_demo_annotation_based.controller",
		"com.vastika.spring_core_demo_annotation_based.service" })

@PropertySource(value="classpath:name.properties")
public class SpringConfig {

}

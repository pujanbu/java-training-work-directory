package com.vastika.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//annotation for rest api
@RestController
public class HelloController {

	@GetMapping("/greet")
	public String greet() {
		return "Hello World!!";
	}
}

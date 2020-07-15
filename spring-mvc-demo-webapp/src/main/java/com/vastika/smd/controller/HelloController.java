package com.vastika.smd.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	// these below methods are alternatives of each other

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public ModelAndView sayHello() {
		ModelAndView view = new ModelAndView("hello");
		view.addObject("msg", "Good Morning from PUJAN..");
		return view;
	}

//	@RequestMapping(value = "/greet", method = RequestMethod.GET)
//	public String sayHi() {
//		return "hi";
//	}

	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	public String sayHi(Model model) {
		model.addAttribute("message", "aba ko sarkar KP oli ko sarkar.");
		return "hi";
	}

//	@RequestMapping(value = "/greet", method = RequestMethod.GET)
//	public String greet(@RequestParam("first_name")  String fname, @RequestParam("last_name") String lname,
//			Model model) {
//		model.addAttribute("message", "Good Evening" + fname + lname);
//		return "hi";
//	}

	@RequestMapping(value = "/greet1", method = RequestMethod.GET)
	public String greet(@RequestParam("first_name") String fname, @RequestParam("last_name") String lname,
			Model model) {
		model.addAttribute("message", "Good Evening" + fname + lname);
		return "hi";
	}

	@RequestMapping(value = "/greet2", method = RequestMethod.GET)
	public String greet(@RequestParam Map<String, String> data, Model model) {
		model.addAttribute("message", "Good Evening: " + data.get("first_name") + " " + data.get("middle_name") + " "
				+ data.get("last_name"));
		return "hi";
	}

	// above all are examples of query params

	// now we are doing path params

	@RequestMapping(value = "/greet3/{fname}/{last_name}", method = RequestMethod.GET)
	public String greet3(@PathVariable String fname, @PathVariable("last_name") String lname, Model model) {
		model.addAttribute("message", "Good Evening: " + fname + " " + lname);
		return "hi";
	}

}

package com.vastika.smd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.vastika.smd.model.User;
import com.vastika.smd.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/add_user")
	public String getAddUserForm() {
		return "addUser";
	}

	@RequestMapping(value = "/list_user")
	public String getAllUserInfo(Model model) {
		model.addAttribute("users", userService.getAllUserInfo());
		return "listUser";
	}

	@RequestMapping(value = "/delete_user", method = RequestMethod.GET)
	public String deleteUserInfo(@RequestParam int id) {
		userService.deleteUserInfo(id);
		return "redirect:/list_user";
	}

//	this is a basic way to do
//	@RequestMapping(value="/save_user", method = RequestMethod.POST)
//	public String saveUserInfo(@RequestParam String uname, @RequestParam String email, @RequestParam String pass) {
//		
//		System.out.println("Username is ::"+" "+uname+" "+"and email is :: "+ email);
//		return "addUser";
//	}

//	more advance way to do by creating model class and binding the values.
	@RequestMapping(value = "/save_user", method = RequestMethod.POST)
	public String saveUserInfo(@ModelAttribute User user) {

//		System.out.println("Username is ::" + " " + user.getUserName());
//		System.out.println("and email is :: " + user.getEmail());
//		System.out.println("Password is ::" + user.getPassword());
//		System.out.println("MObile Number  is ::" + user.getMobileNo());
//		System.out.println("Date Number  is ::" + user.getDob());
//		System.out.println("verification  is ::" + user.getVerificationType());
//		System.out.println("Hobbies  is ::" + user.getHobbies());
//		System.out.println("gender  is ::" + user.getGender());
		userService.saveUserInfo(user);
		return "redirect:/list_user";
	}

	@RequestMapping(value = "/update_user", method = RequestMethod.POST)
	public String updateUserInfo(@ModelAttribute User user) {
		userService.updateUserInfo(user);
		return "redirect:/list_user";
	}

	@RequestMapping(value = "/edit_user")
	public String getEditUserForm(@RequestParam int id, Model model) {
		model.addAttribute("user", userService.getUserInfoById(id));
		return "editUser";
	}
}

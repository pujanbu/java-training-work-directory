package com.vastika.collegeinfo.service;

import java.util.List;

import com.vastika.collegeinfo.model.User;

public interface UserService {
	void saveUserInfo(User user);
	void updateUserInfo(User user);
	List <User> getAllUserInfo();
	void deleteUserInfo(int id);
	User getUserById(int id);
	User getUserByUsernameAndPassword(String username, String password);

}

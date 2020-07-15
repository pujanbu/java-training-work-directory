package com.vastika.smd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vastika.smd.model.User;
import com.vastika.smd.repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void saveUserInfo(User user) {
		// TODO Auto-generated method stub
		userRepository.saveUserInfo(user);
	}

	@Override
	public List<User> getAllUserInfo() {
		// TODO Auto-generated method stub
		return userRepository.getAllUserInfo();
	}

	@Override
	public void deleteUserInfo(int id) {
		userRepository.deleteUserInfo(id);

	}

	@Override
	public User getUserInfoById(int id) {

		return userRepository.getUserInfoById(id);
	}

	@Override
	public void updateUserInfo(User user) {
		userRepository.updateUserInfo(user);
	}

}

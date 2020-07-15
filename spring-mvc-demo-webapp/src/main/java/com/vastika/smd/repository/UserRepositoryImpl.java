package com.vastika.smd.repository;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.vastika.smd.model.User;
import com.vastika.smd.util.QueryUtil;
import com.vastika.smd.util.UserRowMapper;

public class UserRepositoryImpl implements UserRepository {

	@Autowired
	private DataSource dataSource;

	@Override
	public void saveUserInfo(User user) {
		// TODO Auto-generated method stub

//		basic way to do without creating the getjdbcTemplate function
//		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
//		jdbcTemplate.update(QueryUtil.INSERT_SQL,
		getJdbcTemplate().update(QueryUtil.INSERT_SQL,
				new Object[] { user.getUserName(), user.getPassword(), user.getEmail(), user.getGender(), user.getDob(),
						user.getHobbies(), user.getMobileNo(), user.getAddress().getCityName(),
						user.getAddress().getCountryName(), user.getVerificationType() });
	}

	@Override
	public List<User> getAllUserInfo() {
		List<User> userList = getJdbcTemplate().query(QueryUtil.LIST_SQL, new UserRowMapper());

		return userList;
	}

	@Override
	public void deleteUserInfo(int id) {
		getJdbcTemplate().update(QueryUtil.DELETE_SQL, new Object[] { id });

	}

	@Override
	public User getUserInfoById(int id) {
		List<User> userList = getJdbcTemplate().query(QueryUtil.GET_BY_ID_SQL, new Object[] { id },
				new UserRowMapper());

		return userList.get(0);
	}

	private JdbcTemplate getJdbcTemplate() {
		return new JdbcTemplate(dataSource);
	}

	@Override
	public void updateUserInfo(User user) {
		getJdbcTemplate().update(QueryUtil.UPDATE_SQL,
				new Object[] { user.getUserName(), user.getPassword(), user.getEmail(), user.getGender(), user.getDob(),
						user.getHobbies(), user.getMobileNo(), user.getAddress().getCityName(),
						user.getAddress().getCountryName(), user.getVerificationType(), user.getId() });

	}
}

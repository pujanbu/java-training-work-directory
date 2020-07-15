package com.vastika.smd.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.vastika.smd.model.Address;
import com.vastika.smd.model.User;

public class UserExtractor implements ResultSetExtractor<User> {

	@Override
	public User extractData(ResultSet rs) throws SQLException, DataAccessException {
		// TODO Auto-generated method stub
		User user = new User();
		user.setId(rs.getInt("id"));
		user.setUserName(rs.getString("user_name"));
		user.setPassword(rs.getString("password"));
		user.setDob(rs.getDate("dob"));
		user.setEmail(rs.getString("email"));
		user.setMobileNo(rs.getLong("mobile_no"));
		user.setHobbies(rs.getString("hobbies"));
		user.setGender(rs.getString("gender"));
		user.setVerificationType(rs.getString("verification_type"));

		Address address = new Address();
		address.setCityName(rs.getString("city_name"));
		address.setCountryName(rs.getString("country_name"));
		user.setAddress(address);

		return user;
	}

}

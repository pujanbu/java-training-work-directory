package com.vastika.spring_core_demo_daointro;

public class User {

	MysqlDao userDao = new MysqlDao();
	OracleDao oracleDao=new OracleDao()

	public void addUserInfo(User user) {
		userDao.addUserInfo(this);
	}
}

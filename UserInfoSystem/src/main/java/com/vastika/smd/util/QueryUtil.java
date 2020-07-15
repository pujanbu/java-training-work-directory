package com.vastika.smd.util;

public class QueryUtil {
	public static final String INSERT_SQL = "insert into user_tbl(user_name, password, email, gender, dob,hobbies,mobile_no,city_name,country_name,verification_type) values(?,?,?,?,?,?,?,?,?,?)";
	public static final String LIST_SQL = "select * from user_tbl";
	public static final String DELETE_SQL = "delete from user_tbl where id=?";
	public static final String GET_BY_ID_SQL = "select * from user_tbl where id=?";
	public static final String UPDATE_SQL = "update user_tbl set user_name=?, password=?, email=?, gender=?, dob=?,hobbies=?,mobile_no=?,city_name=?,country_name=?,verification_type=? where id=?";

}

package com.vastika.demo.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "student_tbl")
public class Student {

	private int id;
	private String studentName;
	private int roll;
	private String address;
	private String email;
	private Date dob;
	private String department;
	private String subject;

}

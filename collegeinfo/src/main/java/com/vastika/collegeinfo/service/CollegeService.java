package com.vastika.collegeinfo.service;

import java.util.List;

import com.vastika.collegeinfo.model.College;

public interface CollegeService {
	void saveCollegeInfo(College college);
	void updateCollegeInfo(College college);
	List <College> getAllCollegeInfo();
	void deleteCollegeInfo(int id);
	College getCollegeById(int id);
}

package com.tanish.services;

import java.util.LinkedHashMap;
import java.util.List;

import com.tanish.entities.Branch;
import com.tanish.entities.Student;

public interface StudentService {

	public void addBranch(Branch branch);
	public LinkedHashMap<Integer,String> getAllBranch();
	public void saveStudent(Student student);
}

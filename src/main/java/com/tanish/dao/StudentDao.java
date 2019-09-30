package com.tanish.dao;

import java.util.LinkedHashMap;
import java.util.List;

import com.tanish.entities.Branch;
import com.tanish.entities.Student;

public interface StudentDao {

	public void addBranch(Branch branch);
	public LinkedHashMap<Integer,String> getBranchList();
	public void saveStudent(Student student);
}

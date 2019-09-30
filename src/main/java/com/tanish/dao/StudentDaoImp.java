package com.tanish.dao;


import java.util.LinkedHashMap;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tanish.entities.Branch;
import com.tanish.entities.Student;

@Repository
public class StudentDaoImp implements StudentDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addBranch(Branch branch) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(branch);
		tx.commit();
		session.close();
	}

	public LinkedHashMap<Integer,String> getBranchList() {
		
		Session session=sessionFactory.openSession();
		String hql="from Branch";
		Query query=session.createQuery(hql);
		List<Branch> list=query.list();
		
		LinkedHashMap<Integer,String> map=new LinkedHashMap<Integer, String>();
		for(int i=0;i<list.size();i++)
		{
			map.put(list.get(i).getId(),list.get(i).getName());
		}
		return map;
	}

	public void saveStudent(Student student) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(student);
		tx.commit();
		session.close();
		
	}
	

}

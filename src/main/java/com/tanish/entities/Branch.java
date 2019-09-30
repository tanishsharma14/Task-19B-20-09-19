package com.tanish.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Branch {

	@Id
	public int id;
	public String name;
	public Branch(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Branch() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Branch [id=" + id + ", name=" + name + "]";
	}

	
	
	
	
}

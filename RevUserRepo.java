package com.registration.repository;

import java.util.List;

import com.expense.model.RevUser;

public interface RevUserRepo {
	
	
	//to get or update data using ordered list
	static List<RevUser> findAllRevUsers() {
		// TODO Auto-generated method stub
		return null;
	}
	
	//inserts a new record into table
	static void save(RevUser revuser) {
		// TODO Auto-generated method stub
		
	}
	
	//updates existing record
	void update(RevUser revuser);
	
	
//finds single employee by id
	RevUser findById(int id);
}
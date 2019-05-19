package com.selnbye.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.selnbye.model.User;
import com.selnbye.dao.UserDao;
import com.sun.tools.javac.util.List;

public class UserServiceImplement implements UserService {
	
	@Autowired
	private UserDao UserDao;

	@Transactional
	public void add(User User) {
		UserDao.add(User);
		
	}

	@Transactional
	public void edit(User User) {
		UserDao.edit(User);
		
	}

	@Transactional
	public void delete(int uid) {
		UserDao.delete(uid);
		
	}

	@Transactional
	public User getUser(int uid) {
		// TODO Auto-generated method stub
		return UserDao.getUser(uid);
	}

	@Transactional
	public List getAllUser() {
		// TODO Auto-generated method stub
		return UserDao.getAllUser();
	}

}

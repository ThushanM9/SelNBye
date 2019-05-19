package com.selnbye.dao.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.selnbye.dao.UserDao;
import com.selnbye.model.User;
import com.selnbye.model.payment;
import com.sun.tools.javac.util.List;

@Repository
public class UserDaoImplement implements UserDao {

	@Autowired
	 private SessionFactory session;
	
	@Override
	public void add(User User) {
		// TODO Auto-generated method stub
		session.getCurrentSession().save(User);
	}

	@Override
	public void edit(User User) {
		// TODO Auto-generated method stub
		session.getCurrentSession().update(User);

	}

	@Override
	public void delete(int uid) {
		// TODO Auto-generated method stub
		session.getCurrentSession().delete(getUser(uid));

	}

	@Override
	public User getUser(int uid) {
		// TODO Auto-generated method stub
		return (User)session.getCurrentSession().get(User.class,uid);
	}

	@Override
	public List getAllUser() {
		// TODO Auto-generated method stub
		return session.getCurrentSession().createQuery("from User").list();
	}

}

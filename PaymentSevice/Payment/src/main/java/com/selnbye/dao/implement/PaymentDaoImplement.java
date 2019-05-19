package com.selnbye.dao.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.selnbye.dao.PaymentDao;
import com.selnbye.model.payment;
import com.sun.tools.javac.util.List;

@Repository
 public class PaymentDaoImplement implements PaymentDao {
	 @Autowired
	 private SessionFactory session;
	@Override
	public void add(payment payment) {
		// TODO Auto-generated method stub
		session.getCurrentSession().save(payment);
	}

	@Override
	public void edit(payment payment) {
		// TODO Auto-generated method stub
		session.getCurrentSession().update(payment);

	}

	@Override
	public void delete(int pid) {
		// TODO Auto-generated method stub
		session.getCurrentSession().delete(getPayment(pid));
	}

	@Override
	public payment getpayment(int pid) {
		// TODO Auto-generated method stub
		return (payment)session.getCurrentSession().get(payment.class,pid);
	}

	@Override
	public List getAllpayment() {
		// TODO Auto-generated method stub
		return session.getCurrentSession().createQuery("from payment").list();
	}

}

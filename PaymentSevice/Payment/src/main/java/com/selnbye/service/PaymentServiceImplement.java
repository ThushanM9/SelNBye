package com.selnbye.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.selnbye.dao.PaymentDao;
import com.selnbye.model.payment;
import com.sun.tools.javac.util.List;

@Service 
public class PaymentServiceImplement implements PaymentService {

	@Autowired
	private PaymentDao paymentDao;
	
	
	
	@Transactional
	public void add(payment payment) {
		paymentDao.add(payment);
	}

	
	@Transactional
	public void edit(payment payment) {
		paymentDao.edit(payment);

	}

	@Transactional
	public void delete(int pid) {
		paymentDao.delete(pid);

	}

	@Transactional
	public payment getpayment(int pid) {
		// TODO Auto-generated method stub
		return paymentDao.getpayment(pid);
	}

	@Transactional
	public List getAllpayment() {
		// TODO Auto-generated method stub
		return paymentDao.getAllpayment();
	}

}

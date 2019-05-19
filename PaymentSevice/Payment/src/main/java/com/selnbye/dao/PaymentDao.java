package com.selnbye.dao;

import com.selnbye.model.payment;
import com.sun.tools.javac.util.List;


public interface PaymentDao {
	//add
	public void add(payment payment) ;
	
	//update
	public void edit(payment payment);
	
	//delete
	public void delete(int pid);
	
	
	public payment getpayment (int pid);
	
	//view payment
	public List getAllpayment();
	

}

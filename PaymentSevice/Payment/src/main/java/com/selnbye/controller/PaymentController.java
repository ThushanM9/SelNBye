package com.selnbye.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.selnbye.model.payment;
import com.selnbye.service.PaymentService;

@Controller
public class PaymentController {

	private PaymentService paymentSevice;
	
	@RequestMapping("/index")
	public String setupForm(Map<String,Object>map) {
		payment payment = new payment();
		map.put("payment", payment);
		map.put("paymentList", PaymentService.getAllpayment());
		return "payment";
	}
	
	@RequestMapping(value= "/payment.do", method=RequestMethod.POST)
	public String doActions(@ModelAttribute payment payment, BindingResult result, @RequestParam String action,Map<String,Object>map ) {
		payment paymentResult = new payment();
		switch(action.toLowerCase()) {
		case "add":
			PaymentService.add(payment);
			paymentResult = payment;
			break;
			
		case "edit":
			PaymentService.edit(payment);
			paymentResult = payment;
			break;
		case "delete":
			PaymentService.delete(payment.getpid());
			paymentResult = new payment();
			break;
		case "search ":
			payment searchedPayment =PaymentService.getpayment(payment.getpid());
			paymentResult = searchPayment != null? searchedPayment:new payment();
			break;
		}
		
		map.put("payment",paymentResult);
		map.put("paymentList",PaymentService.getAllpayment());
		return "payment";
	}
	
}

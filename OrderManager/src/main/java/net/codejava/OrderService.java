package net.codejava;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrderService {
	@Autowired
	private OrderRepository repo;
	
	public List<Order> listAll() {
		return repo.findAll();
	}
	
	public void save(Order orders) {
		repo.save(orders);
	}
	
	public Order get(long ordersId) {
		return repo.findById(ordersId).get();
	}
	
	public void delete(long ordersId) {
		repo.deleteById(ordersId);
	}

}

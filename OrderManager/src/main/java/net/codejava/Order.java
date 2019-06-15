package net.codejava;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Order {
	private Long ordersId;
	private String customerName;
	private Long productId;
	private String productrName;
	private Long qty;
	
	protected Order() {
	}
	protected Order(Long ordersId, String customerName, Long productId, String productrName, Long qty) {
		super();
		this.ordersId = ordersId;
		this.customerName = customerName;
		this.productId =productId;
		this.productrName = productrName;
		this.qty = qty;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getOrderId() {
		return ordersId;
	}
	public void setOrdersId(Long ordersId) {
		this.ordersId = ordersId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public String getProductrName() {
		return productrName;
	}
	public void setProductrName(String productrName) {
		this.productrName = productrName;
	}
	public Long getQty() {
		return qty;
	}
	public void setQty(Long qty) {
		this.qty = qty;
	}

	
}

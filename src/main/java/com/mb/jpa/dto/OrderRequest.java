package com.mb.jpa.dto;

import com.mb.jpa.entity.Customer;

public class OrderRequest {
	
	private Customer customer;

	
	
	
	public OrderRequest(Customer customer) {
		super();
		this.customer = customer;
	}
	
	

	public OrderRequest() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "OrderRequest []";
	}

	
}

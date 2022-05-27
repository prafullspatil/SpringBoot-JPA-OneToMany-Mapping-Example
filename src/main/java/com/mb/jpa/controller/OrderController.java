package com.mb.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mb.jpa.dto.OrderRequest;
import com.mb.jpa.dto.OrderResponse;
import com.mb.jpa.entity.Customer;
import com.mb.jpa.repository.CustomerRepository;
import com.mb.jpa.repository.ProductRepository;

@RestController
public class OrderController {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@PostMapping("/placeOrder")
	public Customer placeOrder(@RequestBody OrderRequest request) {
		return customerRepository.save(request.getCustomer());
	}
	
	@GetMapping("/findAllOrders")
	public List<Customer> findAllOrder(){
		return customerRepository.findAll();	
	}
	
	@GetMapping("/getInfo")
	public List<OrderResponse> getJoinInfo(){
		return customerRepository.getJoinInfo();	
	}
	
}
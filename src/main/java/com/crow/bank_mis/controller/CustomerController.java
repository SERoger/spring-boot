package com.crow.bank_mis.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.crow.bank_mis.entity.Customer;
import com.crow.bank_mis.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@GetMapping("/customers")
	public ResponseEntity<List<Customer>> getAll(){
		System.out.println("Here");
		return new ResponseEntity<>(customerService.getAll(),HttpStatus.OK);
	}
	
	@PostMapping("/customer")
	public ResponseEntity<Customer> create(@RequestBody Customer customer){
		return new ResponseEntity<>(customerService.create(customer),HttpStatus.CREATED);
	}
	
}

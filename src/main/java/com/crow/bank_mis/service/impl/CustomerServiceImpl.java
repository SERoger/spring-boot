package com.crow.bank_mis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.crow.bank_mis.entity.Customer;
import com.crow.bank_mis.repository.CustomerRepository;
import com.crow.bank_mis.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;
	
	@Override
	public Customer create(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public Customer change(Long id, Customer customer) {
		return null;
	}

	@Override
	public List<Customer> getAll() {
		List<Customer> customers=(List<Customer>) customerRepository.findAll();
		return customers;
	}

	@Override
	public String delete(Long id) {
		customerRepository.deleteById(id);
		return "delted";
	}

	@Override
	public Customer getOne(Long id) {
		return customerRepository.findById(id).get();
	}

}

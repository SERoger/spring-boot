package com.crow.bank_mis.service;

import java.util.List;
import com.crow.bank_mis.entity.Customer;

public interface CustomerService {
	public Customer create(Customer customer);
	public Customer change(Long id,Customer customer);
	public List<Customer> getAll();
	public String delete(Long id);
	public Customer getOne(Long id);
}

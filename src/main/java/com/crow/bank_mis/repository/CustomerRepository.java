package com.crow.bank_mis.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crow.bank_mis.entity.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}

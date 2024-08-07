package com.crow.bank_mis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crow.bank_mis.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

}

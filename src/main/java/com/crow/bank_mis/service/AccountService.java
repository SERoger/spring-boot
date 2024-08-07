package com.crow.bank_mis.service;

import java.util.List;

import javax.security.auth.login.AccountNotFoundException;

import com.crow.bank_mis.entity.Account;

public interface AccountService {
	public Account create(Account account);
	public Account change(int id,Account account) throws AccountNotFoundException;
	public List<Account> getAll();
	public String delete(int id);
	public Account getOne(int id);
}

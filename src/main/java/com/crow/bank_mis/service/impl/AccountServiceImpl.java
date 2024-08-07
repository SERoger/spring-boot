package com.crow.bank_mis.service.impl;

import java.util.List;
import java.util.Optional;
import javax.security.auth.login.AccountNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.crow.bank_mis.entity.Account;
import com.crow.bank_mis.entity.Customer;
import com.crow.bank_mis.repository.AccountRepository;
import com.crow.bank_mis.service.AccountService;
import com.crow.bank_mis.service.CustomerService;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	AccountRepository accountRepository;
	
	@Autowired
	CustomerService customerService;
	
	@Override
	public Account create(Account account) {
		return accountRepository.save(account);
	}

	@Override
	public Account change(int id, Account account) throws AccountNotFoundException {
		Optional<Account> accountOpt=accountRepository.findById(id);
		if(accountOpt.isPresent()) {
			if(account.getNickName()!=null) {
				if(account.getBalance()!=0) {
					if(account.getCustomer().getId()!=null) {
						Account acc=accountOpt.get();
						acc.setNickName(account.getNickName());
						acc.setBalance(account.getBalance());
						return accountRepository.save(acc);	
					}else {
						return null;
					}
				}else {
					return null;
				}				
			}else {
				return null;
			}
		}else {
			throw new AccountNotFoundException("Account not found");
		}
	}

	@Override
	public List<Account> getAll() {
		return accountRepository.findAll();
	}

	@Override
	public String delete(int id) {
		Optional<Account> accountOpt=accountRepository.findById(id);
		accountRepository.delete(accountOpt.get());
		return "delted";
	}

	@Override
	public Account getOne(int id) {
		return accountRepository.findById(id).get();
	}

}

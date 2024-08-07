package com.crow.bank_mis.controller;

import java.util.List;
import javax.security.auth.login.AccountNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crow.bank_mis.entity.Account;
import com.crow.bank_mis.service.AccountService;

@RestController
public class AccountController {
	@Autowired
	AccountService accountService;
	
	@GetMapping("/accounts")
	public ResponseEntity<List<Account>> getAll(){
		return new ResponseEntity<>(accountService.getAll(),HttpStatus.OK);
	}
	
	@PostMapping("/account")
	public ResponseEntity<Account> create(@RequestBody Account account){
		return new ResponseEntity<>(accountService.create(account),HttpStatus.CREATED);
	}
	
	@PutMapping("/account/{id}")
	public ResponseEntity<Account> change(@PathVariable int id ,@RequestBody Account account) throws AccountNotFoundException{
		return new ResponseEntity<>(accountService.change(id, account),HttpStatus.ACCEPTED);
	}
}

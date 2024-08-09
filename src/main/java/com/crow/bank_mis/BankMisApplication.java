package com.crow.bank_mis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy(proxyTargetClass = true)
@SpringBootApplication
public class BankMisApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankMisApplication.class, args);
	}

}

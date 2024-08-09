package com.crow.bank_mis.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AppAspect {
	
	@Before("execution(* com.crow.bank_mis.service.*.*())")
	public void printBefore(JoinPoint joinPoint) {
		System.out.println("about to run"+joinPoint.getSignature());
	}
	
	@After("execution(* com.crow.bank_mis.service.*.*(..))")
	public void printAfter(JoinPoint joinPoint) {
		System.out.println("finished running "+joinPoint.getSignature());
	}
	
//	@Around("execution(* com.crow.bank_mis.service.*.*())")
//	public void printBeforeAndAfter(JoinPoint joinPoint) {
//		System.out.println("block "+joinPoint.getSignature());
//	}
	
}

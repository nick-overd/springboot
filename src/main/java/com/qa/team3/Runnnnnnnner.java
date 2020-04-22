package com.qa.team3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.qa.team3.data.domain.AccountNumber;

//@SpringBootApplication
public class Runnnnnnnner {
	public static void main(String[] args) throws Exception {
		//SpringApplication.run(Runnnnnnnner.class, args);
		AccountNumber num1 = new AccountNumber();
		System.out.println(num1.accountGen());
		
	}

}

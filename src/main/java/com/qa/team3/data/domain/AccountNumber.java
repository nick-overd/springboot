package com.qa.team3.data.domain;

import java.util.Random;

//import javax.persistence.Entity;

//@Entity
public class AccountNumber {

	private long number;

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public String accountNumGen() {
		// char c = 67;
		// String num = "" + c + 123456;

		Random rand = new Random();
		String num = "";

		int y = rand.nextInt(3);
		
		for (int i = 0; i < 6 + (2 * y); i++) {
			int x = rand.nextInt(9);
			num += x;

		}
		
		return num;
	}
	
	public String accountGen() {
		
		Random rand = new Random();
		String num = "";
		
		int y = rand.nextInt(3);
		if(y==0) {
			num = "a"; 
		}
		else if(y==1) {
			num = "b";
		}
		else {
			num = "c";
		}
		
		return num + accountNumGen();
		
	}

}

package com.qa.team3.rest;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.team3.data.domain.Account;
import com.qa.team3.dto.AccountDto;
import com.qa.team3.service.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {
	private AccountService accountservice;

	public AccountController(AccountService accountservice) {
		this.accountservice = accountservice;
	}
	@PostMapping("/create")
 	public AccountDto create(@RequestBody Account account) {
 	return this.accountservice.create(account);
 	}
 	 
 	@GetMapping("/read")
 	public List<AccountDto> read() {
 	return this.accountservice.read();
 	}
 	 
 	@PutMapping("/update/{id}")
 	public Account update(@PathParam("name") String firstName, @PathParam("colour") String lastName, @PathVariable Long id) {
 	return this.accountservice.update(firstName, lastName, id);
 	}
 	 
 	@DeleteMapping("/delete/{id}")
 	public boolean delete(@PathVariable Long id) {
 	return this.accountservice.delete(id);
 	}

	
}

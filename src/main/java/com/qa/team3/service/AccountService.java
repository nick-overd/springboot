package com.qa.team3.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.qa.team3.data.domain.Account;
import com.qa.team3.data.repo.AccountRepo;
import com.qa.team3.dto.AccountDto;
import com.qa.team3.exceptions.AccountNotFoundException;

@Service
public class AccountService {

	private AccountRepo accountRepo;
	private ModelMapper mapper;

	public AccountService(AccountRepo accountRepo, ModelMapper mapper) {
		this.accountRepo = accountRepo;
		this.mapper = mapper;
	}

	private AccountDto map(Account account) {
		return this.mapper.map(account, AccountDto.class);

	}

	public List<AccountDto> read() {
		return this.accountRepo.findAll().stream().map((Account) -> this.map(Account)).collect(Collectors.toList());

	}

	public AccountDto create(Account account) {
		Account savedAccount = this.accountRepo.save(account);
		AccountDto dto = map(savedAccount);
		return dto;
	}

	public boolean delete(Long id) {
		this.accountRepo.deleteById(id);
		return this.accountRepo.existsById(id);
	}
	public Account update(String firstName, String lastName, Long id) {
	 	Account account = this.accountRepo.findById(id).orElseThrow(() -> new AccountNotFoundException());
	 	account.setFirstName(firstName);
	 	account.setLastName(lastName);
	 	return this.accountRepo.save(account);
	 	
	}


}
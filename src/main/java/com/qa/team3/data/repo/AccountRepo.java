package com.qa.team3.data.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.team3.data.domain.Account;

@Repository
public interface AccountRepo extends JpaRepository<Account, Long> {

}

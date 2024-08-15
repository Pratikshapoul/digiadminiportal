package com.ibn.digiadminiportal.serviceimpl;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ibn.digiadminiportal.entity.Account;
import com.ibn.digiadminiportal.repository.AccountRepository;
import com.ibn.digiadminiportal.service.AccountService;

@Component

public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository  accountRepository;

	@Override
	public Account createAccount(Account account) {
		Account createdAccount = accountRepository.save(account);		
				return createdAccount;
	}

	@Override
	public List<Account> getAllAccountData(Account account) {
		return accountRepository.findAll();
		
	}
	@Override
	public Optional<Account> getAccountById(Long id) {
		Optional<Account> account = accountRepository.findById(id);
		if (account.isPresent()) {
	
	} else  {
}
		return account;}

	@Override
	public List<Account> findAccountsByOwner(String ownerKeyword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAccountData(Account account) {
		accountRepository.deleteAll();
	}

	@Override
	public Optional<Account> getAccountByUserId(Long userid) {
		Optional<Account> account= accountRepository.findById(userid);
		return account;
	}

}

package com.ibn.digiadminiportal.service;

import java.util.List;


import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ibn.digiadminiportal.entity.Account;

@Service
public interface AccountService {

	public Account createAccount (Account account );
	
	public List <Account> getAllAccountData (Account account);

	public Optional<Account> getAccountById (Long id);
	
	public List<Account> findAccountsByOwner (String ownerKeyword);
	
	public void deleteAccountData(Account account);
	
	public Optional<Account> getAccountByUserId(Long userid);

	
	
	
}

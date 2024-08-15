package com.ibn.digiadminiportal.controller;

import java.util.List;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ibn.digiadminiportal.dto.CustomerDetailsDto;
import com.ibn.digiadminiportal.entity.Account;
import com.ibn.digiadminiportal.service.AccountService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping ("/account")
public class AccountController {
	
	@Autowired 
	private AccountService accountService;
	
	@Autowired 
	private RestTemplate restTemplate;

	/**
	 * this api is udes to create account data
	 * @param account
	 * @return create account 
	 */
	@PostMapping ("/create-account")
	public ResponseEntity <Account> createAccount (@RequestBody Account account) {
		Account createAccount = accountService.createAccount(account);
		return new ResponseEntity <> (createAccount,HttpStatus.CREATED) ;
	}
	/**
	 * this api is used to fetch all data the record of accounts
	 * @return account details 
	 */
	@GetMapping ("/account-data")
	public ResponseEntity <List<Account>> getAllAccountData() {
		List <Account> accountList = accountService.getAllAccountData(null);
		return new ResponseEntity <> ( accountList , HttpStatus.OK);
		
	}
	/**
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping ("/accounts-data/{id}")
	public ResponseEntity <Account> getAccountById(@PathVariable Long id){
		Optional<Account> accountOptional = accountService.getAccountById(id);
		return new ResponseEntity <Account>(accountOptional.isPresent() ? accountOptional.get(): null,
				accountOptional.isPresent() ? HttpStatus.OK : HttpStatus.NOT_FOUND);
	}
	/**
	 * 
	 * @param ownerKeyword
	 * @return
	 */
	@GetMapping ("/accounts/owner")
	public ResponseEntity <List<Account>> getAccountsByOwner(@PathParam("ownerKeyword") String ownerKeyword) {
		List <Account> accountList = accountService.findAccountsByOwner(ownerKeyword);
		return new ResponseEntity <> ( accountList , HttpStatus.OK);
}	
	/**
	 * 
	 * @param account
	 * @return
	 */
	@DeleteMapping("/delete-accountdata")
	public String deleteCustData(@RequestBody Account account) {
		accountService.deleteAccountData(account);
		return "Data Deleted Succeesfully";
	}
	//Error
	@GetMapping("/get-account/{userid}")
	public ResponseEntity<Account> getAccountByid(@PathVariable Long userid){
		//to get account data
		Optional<Account> accountOptional = accountService.getAccountByUserId(userid);
		
		Account account = new Account();
		if(accountOptional.isPresent()) {
			
			 account = accountOptional.get();
			
			 //api call to get customer data
			 // RestTemplate used for call the services
			List<CustomerDetailsDto> customerDetails= restTemplate.getForObject("http://localhost:8090/Customer/get-cust/" + userid, List.class);
			
			account.setCustomerData(customerDetails);
			
		}
		return new ResponseEntity<Account> (accountOptional.isPresent() ? account : null, 
				accountOptional.isPresent() ? HttpStatus.OK : HttpStatus.NOT_FOUND);
	}}
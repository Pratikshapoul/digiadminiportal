package com.ibn.digiadminiportal.entity;

import java.util.List;
import com.ibn.digiadminiportal.dto.CustomerDetailsDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Data;

@Entity
@Data
@Table (name = "Account")
public class Account {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column (name = "accountNumber")
	private String accountNumber;
	
	@Column ( name = "accountType")
	private String accountType;
	
	@Column (name = "owner")
	private String owner;
	
	@Column (name = "balance")
	private double balance;

	@Column (name = "userid")
	private Long userid;
	
	@Transient
	private List <CustomerDetailsDto> customerData;
	
	
}

//"owner": "akshay Mane" ,
//"Balance" : 7000
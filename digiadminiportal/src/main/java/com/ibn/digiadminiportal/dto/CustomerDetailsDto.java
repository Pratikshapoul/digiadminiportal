package com.ibn.digiadminiportal.dto;
import lombok.Data;


@Data
public class CustomerDetailsDto {

	
	private long id;
	
	private String name;
	
	private String SurName;
	
	private String address;
	
	private String mobileNumber;

	public CustomerDetailsDto() {
		super();
	}

	public CustomerDetailsDto(long id, String name, String surName, String address, String mobileNumber) {
		super();
		this.id = id;
		this.name = name;
		SurName = surName;
		this.address = address;
		this.mobileNumber = mobileNumber;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return SurName;
	}

	public void setSurName(String surName) {
		SurName = surName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	
}


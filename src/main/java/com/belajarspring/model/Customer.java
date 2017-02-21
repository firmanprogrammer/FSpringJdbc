package com.belajarspring.model;
//ini adalah class model atau disebut juga POJO (Plain Old Java Object)
public class Customer {
	int custId;
	String fullName;
	String address;
	String email;
	
	public Customer(int custId, String fullName, String address, String email) {
		super();
		this.custId = custId;
		this.fullName = fullName;
		this.address = address;
		this.email = email;
	}

	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
		
}

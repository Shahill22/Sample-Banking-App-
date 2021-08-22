package com.shahil.BankApp.model;

public class Customer {
	private String password;
	private String bankAccNo;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getBankAccNo() {
		return bankAccNo;
	}
	public void setBankAccNo(String bankAccNo) {
		this.bankAccNo = bankAccNo;
	}
	public Customer(String password, String bankAccNo) {
		this.password = password;
		this.bankAccNo = bankAccNo;
	}
	

}

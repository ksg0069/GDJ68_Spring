package com.iu.main.bookAccount;

import java.sql.Date;

public class BookAccountDTO {
	
	private Long accountNum;
	private String id;
	private Long bookNum;
	private Long account; //통장번호
	private String accountPassword;
	private Long accountBalance;
	private Date accountDate;
	
	public Long getAccountNum() {
		return accountNum;
	}
	public Date getAccountDate() {
		return accountDate;
	}
	public void setAccountDate(Date accountDate) {
		this.accountDate = accountDate;
	}
	public void setAccountNum(Long accountNum) {
		this.accountNum = accountNum;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public Long getBookNum() {
		return bookNum;
	}
	public void setBookNum(Long bookNum) {
		this.bookNum = bookNum;
	}
	public Long getAccount() {
		return account;
	}
	public void setAccount(Long account) {
		this.account = account;
	}

	
	public String getAccountPassword() {
		return accountPassword;
	}
	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}
	public Long getAccountBalance() {
		if(this.accountBalance == null) {
			this.accountBalance=0L;
		}
		return accountBalance;
	}
	public void setAccountBalance(Long accountBalance) {
		this.accountBalance = accountBalance;
	}

	
	
}

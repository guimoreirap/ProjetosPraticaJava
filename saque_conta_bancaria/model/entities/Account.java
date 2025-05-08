package model.entities;

import model.exceptions.LimitException;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withDrawLimit;
	
	public Account() {
	}
	
	public Account(Integer number, String holder, Double balance, Double withDrawLimit){
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withDrawLimit = withDrawLimit;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public Double getWithDrawLimit() {
		return withDrawLimit;
	}
	public void setWithDrawLimit(Double withDrawLimit) {
		this.withDrawLimit = withDrawLimit;
	}
	
	public void deposit(Double value) {
		this.balance += value;
	}
	
	public void withdraw(Double value) throws LimitException {
		
		if (this.balance < value) {
			throw new LimitException("The amount exceeds your current balance");
		} else if (this.withDrawLimit < value) {
			throw new LimitException("The amount exceeds withdraw limit");
		} else {
			this.balance -= value;
		}
		
	}
	
}

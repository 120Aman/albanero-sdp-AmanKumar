package com.example.demo.model;

import javax.validation.constraints.Size;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.sun.istack.NotNull;

@Document(collection = "Transactions")
public class Transactions {

	@Indexed(unique = true)
	@NotNull
	private Long transactionId;
	@NotNull
	private Long userId;
	@NotNull
	@Size(max = 150)
	private String description;
	@NotNull
	private String type;
	@NotNull
	private double amount;
	@NotNull
	private double balance;

	public Transactions(Long transactionId, Long userId, @Size(max = 150) String description, String type,
			double amount, double balance) {
		super();
		this.transactionId = transactionId;
		this.userId = userId;
		this.description = description;
		this.type = type;
		this.amount = amount;
		this.balance = balance;
	}

	public Transactions() {
		super();
	}

	public Long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}

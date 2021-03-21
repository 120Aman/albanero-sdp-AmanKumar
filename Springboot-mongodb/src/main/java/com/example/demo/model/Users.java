package com.example.demo.model;

import java.util.List;

import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import com.sun.istack.NotNull;

@Document(collection = "Users")
public class Users {

	@Id
	private Long id;
	@Indexed(unique = true)
	@NotNull
	private String userName;
	@NotNull
	private String password;
	@Indexed(unique = true)
	private String emailId;
	@NotNull
	@Size(min = 6)
	private long pincode;
	@Size(max = 40)
	private String name;
	@Size(max = 150)
	private String address;
	@NotNull
	@Size(min = 10)
	private Long phone;
	@DBRef(lazy = true)
	private List<Transactions> transactions;

	public Users(Long id, String userName, String password, String emailId, @Size(min = 6) long pincode,
			@Size(max = 40) String name, @Size(max = 150) String address, @Size(min = 10) Long phone,
			List<Transactions> transactions) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.emailId = emailId;
		this.pincode = pincode;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.transactions = transactions;
	}

	public Users() {
		super();

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public List<Transactions> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transactions> transactions) {
		this.transactions = transactions;
	}

}

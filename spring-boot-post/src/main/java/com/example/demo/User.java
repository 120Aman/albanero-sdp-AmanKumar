package com.example.demo;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import antlr.collections.List;

@Entity
@Table(name = "users")
@EntityListeners(AuditingEntityListener.class)
public class User {
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private long id;

	
	@Column(name = "user_name", nullable = false)
    private String userName;
	@Column(name = "full_name", nullable = false)
    private String fullName;
    @Column(name = "email_address", nullable = false)
    private String email;
    @Column(name = "mobile_number", nullable = false)
    private long mobilenumber;
    @Column(name = "current_organization", nullable = false)
    private String currentorganization;
    
    public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
    public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getCurrentorganization() {
		return currentorganization;
	}
	public void setCurrentorganization(String currentorganization) {
		this.currentorganization = currentorganization;
	}


	
}
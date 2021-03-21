package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Users;

import com.example.demo.repositories.UserRepository;

@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping("/users")
	public List<Users> getAllUsers() {
		return userRepository.findAll();
	}

	@PostMapping("/users/post")
	public Users createUser(@Validated @RequestBody Users users) {
		return userRepository.save(users);

	}

	@DeleteMapping("/students/{id}")
	public List<Users> deleteuserById(@PathVariable(value = "id") long userId) {
		userRepository.deleteById(userId);
		return userRepository.findAll();
	}

	@DeleteMapping("/users/{emailId}")
	public List<Users> deleteUserByemailId(@PathVariable(value = "emailId") String EmailId) {
		Users users = userRepository.findByEmailId(EmailId);

		userRepository.delete(users);
		return userRepository.findAll();
	}

	@PutMapping("/users/Transactions/{id}")
	public List<Users> updateusers(@PathVariable(value = "id") Long Id, @Validated @RequestBody Users account) {
		Users users = userRepository.getById(Id);
		users.setTransactions(account.getTransactions());

		return userRepository.findAll();
	}
}

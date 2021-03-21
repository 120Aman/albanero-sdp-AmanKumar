package com.example.demo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Users;

@Repository
public interface UserRepository extends MongoRepository<Users, Long> {

	Users findByEmailId(String username);

	Users getById(Long userId);

	Users findByUserName(String username);
}

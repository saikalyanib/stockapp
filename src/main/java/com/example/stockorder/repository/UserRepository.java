package com.example.stockorder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.stockorder.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findByuserId(String userId);  

}
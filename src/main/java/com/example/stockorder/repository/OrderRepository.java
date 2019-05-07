package com.example.stockorder.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.stockorder.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

	public List<Order> findByOrderId(String orderId);
	public List<Order> findByUserId(String userID);
}
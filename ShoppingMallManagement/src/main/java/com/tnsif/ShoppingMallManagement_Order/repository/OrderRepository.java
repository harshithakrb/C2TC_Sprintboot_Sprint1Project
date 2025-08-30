package com.tnsif.ShoppingMallManagement_Order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.ShoppingMallManagement_Order.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
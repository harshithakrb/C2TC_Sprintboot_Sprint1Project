package com.tnsif.ShoppingMallManagement_Order.OrderRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.ShoppingMallManagement_Order.Order.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
package com.tnsif.ShoppingMallManagement_Order.repository;

import com.tnsif.ShoppingMallManagement_Order.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
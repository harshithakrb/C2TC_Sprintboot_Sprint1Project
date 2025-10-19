package com.tnsif.ShoppingMallManagement_Order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tnsif.ShoppingMallManagement_Order.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}

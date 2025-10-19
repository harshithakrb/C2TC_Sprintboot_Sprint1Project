package com.tnsif.ShoppingMallManagement_Order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.ShoppingMallManagement_Order.model.Order;
import com.tnsif.ShoppingMallManagement_Order.repository.OrderRepository;

import jakarta.persistence.NoResultException;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repo;

    // Get all orders
    public List<Order> listAll() {
        return repo.findAll();
    }

    // Save a new order
    public void save(Order order) {
        repo.save(order);
    }

    // Get an order by ID
    public Order get(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new NoResultException("Order not found with id " + id));
    }

    // Delete an order by ID
    public void delete(Long id) {
        repo.deleteById(id);
    }

    // Update an order (just reuse save)
    public void update(Order order) {
        repo.save(order);
    }
}

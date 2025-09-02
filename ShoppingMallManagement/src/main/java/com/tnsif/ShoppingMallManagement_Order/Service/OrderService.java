package com.tnsif.ShoppingMallManagement_Order.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.ShoppingMallManagement_Order.entity.Order;
import com.tnsif.ShoppingMallManagement_Order.repository.OrderRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class OrderService {

    @Autowired
    private OrderRepository repo;

    // Get all orders in DB
    public List<Order> listAll() {
        return repo.findAll();
    }

    // Save order
    public void save(Order order) {
        repo.save(order);//insert or update an order 
    }

    // Get order by ID
    public Order get(Integer id) {
        return repo.findById(id).get();
    }

    // Delete order
    public void delete(Integer id) {
        repo.deleteById(id);
    }

    // Update order
    public void update(Order order) {
        repo.save(order);
    }
}
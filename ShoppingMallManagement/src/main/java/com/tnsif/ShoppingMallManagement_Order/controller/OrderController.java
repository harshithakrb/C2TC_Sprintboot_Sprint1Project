package com.tnsif.ShoppingMallManagement_Order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.tnsif.ShoppingMallManagement_Order.Service.OrderService;
import com.tnsif.ShoppingMallManagement_Order.entity.Order;

import jakarta.persistence.NoResultException;

@RestController
public class OrderController {

    @Autowired
    private OrderService service;

    @GetMapping("/orders")
    public List<Order> list() {
        return service.listAll();
    }

    @PostMapping("/orders")
    public void add(@RequestBody Order order) {
        service.save(order);
    }

    @GetMapping("/orders/{id}")
    public ResponseEntity<Order> get(@PathVariable Integer id) {
        try {
            Order order = service.get(id);
            return new ResponseEntity<>(order, HttpStatus.OK);
        } catch (NoResultException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/orders/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

    @PutMapping("/orders/{id}")
    public ResponseEntity<Order> update(@PathVariable Integer id, @RequestBody Order updatedOrder) {
        try {
            Order existing = service.get(id);
            existing.setCustomerId(updatedOrder.getCustomerId());
            existing.setProductName(updatedOrder.getProductName());
            existing.setQuantity(updatedOrder.getQuantity());
            existing.setTotalPrice(updatedOrder.getTotalPrice());
            existing.setOrderDate(updatedOrder.getOrderDate());
            service.update(existing);
            return new ResponseEntity<>(existing, HttpStatus.OK);
        } catch (NoResultException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
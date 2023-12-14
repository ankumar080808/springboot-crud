package com.anant.SpringbootCrudK8sExample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anant.SpringbootCrudK8sExample.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
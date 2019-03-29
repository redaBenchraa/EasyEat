package com.example.easyeatpayment.controllers;

import org.springframework.data.repository.CrudRepository;

import com.example.easyeatpayment.entities.Orders;


public interface OrdersRepository extends CrudRepository<Orders, Integer> {
}

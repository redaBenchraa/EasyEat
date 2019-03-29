package com.example.easyeatpayment.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.easyeatpayment.entities.Card;

@RestController
@RequestMapping("/")
public class OrdersController {
	@Autowired
	private Environment env;
		
    @PostMapping("/order/{id}")
    public void Pay(@RequestBody Card card, @PathVariable("id") Integer id) {
        //return orderService.edit(id, orders);
    }
	
	@RequestMapping("/admin")
	public String homeAdmin() {
		return "This is the payment administration area of User service running at port: " + env.getProperty("local.server.port");
	}
}
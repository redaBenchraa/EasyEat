package com.example.easyeatpayment.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.easyeatpayment.entities.Card;
import com.example.easyeatpayment.entities.Orders;

@Service
public class OrdersService {
    @Autowired
    private OrdersRepository ordersRepository;
	@Autowired
	private RestTemplate restTemplate;
    
    public void Pay(Card card, int id) {
    	Orders order = ordersRepository.findById(id).get();
    	if(order != null) {
    		// Use stripe to pay for order using card
    		// if payment == success
    		restTemplate.put("http://easy-eat-realtime-service/orders/"+id+"/paid", null);
    		restTemplate.put("http://easy-eat-management-service/order/"+id+"/pay", null);
    		
    	}else {
    		// Throw exception
    	}
    }
}

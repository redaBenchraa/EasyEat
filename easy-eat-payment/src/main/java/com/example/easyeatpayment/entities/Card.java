package com.example.easyeatpayment.entities;

import lombok.Data;

@Data
public class Card {
	private String holder;
	private String number;
	private String cvc;
	private String expiration;
}

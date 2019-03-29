package com.example.easyeatgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class EasyEatGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasyEatGatewayApplication.class, args);
	}

}

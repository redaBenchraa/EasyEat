package com.easyeat.realtimeMicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableAutoConfiguration
@ComponentScan
@EnableEurekaClient
public class RealtimeMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RealtimeMicroserviceApplication.class, args);
	}


}

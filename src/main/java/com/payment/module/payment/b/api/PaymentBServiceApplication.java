package com.payment.module.payment.b.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PaymentBServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentBServiceApplication.class, args);
	}

}

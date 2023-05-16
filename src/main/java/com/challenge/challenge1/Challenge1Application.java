package com.challenge.challenge1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.challenge.challenge1.Entities.Order;
import com.challenge.challenge1.Services.OrderService;


@SpringBootApplication
public class Challenge1Application implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(Challenge1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(1309, 95.9, 0.0);			// Input here
		System.out.println("Order n° " + order.getCode());
		System.out.println("Total price: R$ "+ orderService.total(order));
	}

	
}

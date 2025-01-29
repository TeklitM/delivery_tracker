package com.flomart.delivery_tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@SpringBootApplication
public class DeliveryTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeliveryTrackerApplication.class, args);
	}
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello, World!";
	}
}

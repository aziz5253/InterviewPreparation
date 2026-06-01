package com.inventory.serviceDetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class InventoryServiceDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceDetailsApplication.class, args);
	}

}

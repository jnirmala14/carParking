package com.example.carslot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.carslot")  
@Configuration  
public class CarSlotApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarSlotApplication.class, args);
	}

}

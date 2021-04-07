package com.example.carslot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.carslot.service.CarSlotService;

@RestController
@RequestMapping("carslot")
public class CarSlotController {
	@Autowired
	CarSlotService carslotservice;

	@GetMapping("/createCarSlot/{number}")
	public String createCarSlot(@PathVariable int number) throws ClassNotFoundException {
		System.out.println(number);
		
		return carslotservice.createCarSlotvalues(number);
		
	}
	@GetMapping("/createCarSlot1/{number}")
	public String saveCarSlot(@PathVariable String carnumber,@PathVariable String color) throws ClassNotFoundException {
		System.out.println(carnumber);
		
		return carslotservice.insertvalues(carnumber,color);
		
	}
}

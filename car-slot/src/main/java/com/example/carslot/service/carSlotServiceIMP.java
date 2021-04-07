package com.example.carslot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.carslot.DAO.CarSlotDAO;

@Service
public class carSlotServiceIMP implements CarSlotService{
@Autowired
CarSlotDAO carslotDao;
	@Override
	public String createCarSlotvalues(int number) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		return carslotDao.createCarSlotvalues(number);
		
	}

	@Override
	public String insertvalues(String carNumber, String color) {
		return carslotDao.insertvalues(carNumber, color);
		// TODO Auto-generated method stub
		
	}

}

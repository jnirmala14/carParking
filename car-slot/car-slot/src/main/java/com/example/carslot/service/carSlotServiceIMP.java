package com.example.carslot.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.carslot.DAO.CarSlotDAO;

@Service
public class carSlotServiceIMP implements CarSlotService {
	@Autowired
	CarSlotDAO carslotDao;

	@Override
	public String createCarSlotvalues(int number) throws ClassNotFoundException, SQLException {
		return carslotDao.createCarSlotvalues(number);

	}

	@Override
	public String insertvalues(String carNumber, String color) throws ClassNotFoundException, SQLException {
		return carslotDao.insertvalues(carNumber, color);

	}

	@Override
	public String deleteValue(int id) throws ClassNotFoundException, SQLException {
		return carslotDao.deleteCarSlotvalues(id);
	}

}

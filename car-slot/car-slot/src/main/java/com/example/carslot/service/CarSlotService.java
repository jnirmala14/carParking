package com.example.carslot.service;

import java.sql.SQLException;

public interface CarSlotService {
	public String createCarSlotvalues(int number) throws ClassNotFoundException, SQLException;

	public String insertvalues(String carNumber, String color) throws ClassNotFoundException, SQLException;

	public String deleteValue(int id) throws ClassNotFoundException, SQLException;
}

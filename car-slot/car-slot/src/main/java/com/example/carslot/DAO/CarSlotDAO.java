package com.example.carslot.DAO;

import java.sql.SQLException;

public interface CarSlotDAO {
	public String createCarSlotvalues(int number) throws ClassNotFoundException, SQLException;

	public String insertvalues(String carNumber, String color) throws ClassNotFoundException, SQLException;

	public String deleteCarSlotvalues(int id) throws ClassNotFoundException, SQLException;
}

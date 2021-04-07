package com.example.carslot.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Repository;

@Repository
public class CarSlotDAOImp implements CarSlotDAO {
	Connection con=null;
	ResultSet rset = null;
	
	@Override
	public String createCarSlotvalues(int number) throws ClassNotFoundException, SQLException {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Car", "root", "root");
			Statement stm = con.createStatement();
			stm = con.createStatement();
			int count = 0;
			int rs = 0;
			String sql = "select count(*) from carslot";
			rset = stm.executeQuery(sql);
			while (rset.next()) {
				count = rset.getInt(1);
			}
			if (count != 6) {
				for (int i = 0; i < number; i++) {
					sql = "INSERT INTO carslot (id) VALUES (" + i + ");";
					rs = stm.executeUpdate(sql);
				}
			} else
				return "already created";

			if (rs > 0) {
				return "Success";
			} else {
				return "not created";
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return e.getMessage();
		}finally {
			con.close();
			rset.close();
		}

	}

	@Override
	public String insertvalues(String carNumber, String color) throws ClassNotFoundException, SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Car", "root", "root");
			Statement stm = con.createStatement();
			stm = con.createStatement();
			int count = 0;
			int rs = 0;
			System.out.println(carNumber + "" + color);
			String sql = "select count(*) from carslot";
			rset = stm.executeQuery(sql);
			while (rset.next()) {
				count = rset.getInt(1);
			}
			if (count != 6) {
				sql = "INSERT INTO carslot(carNumber,color) VALUES(" + carNumber + "," + color + ")";

				rs = stm.executeUpdate(sql);
			}else{
				return "parking full";
			}
			if (rs > 0) {
				return "Success added";
			} else {
				return "not added";
			}
		} catch (SQLException e) {
			e.printStackTrace();

		}finally {
			con.close();
			rset.close();
		}
		return null;

	}

	@Override
	public String deleteCarSlotvalues(int id) throws ClassNotFoundException, SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Car", "root", "root");
			Statement stm = con.createStatement();
			stm = con.createStatement();
			String sql = "delete from carslot where id="+id+";";
			int rs = stm.executeUpdate(sql);
			
			if (rs > 0) {
				return "Success deleted";
			} else {
				return "not deleted";
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return e.getMessage();
		}finally {
			con.close();
			rset.close();
		}
	}

}

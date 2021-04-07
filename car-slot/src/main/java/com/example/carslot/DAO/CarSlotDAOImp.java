package com.example.carslot.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Repository;

@Repository
public class CarSlotDAOImp implements CarSlotDAO{

	@Override
	public String createCarSlotvalues(int number) throws ClassNotFoundException {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/Car","root","root");
			Statement stm= con.createStatement();
			stm = con.createStatement();
			int count = 0;
			int rs=0;
			String sql = "select count(*) from carslot" ;
			ResultSet rset=stm.executeQuery(sql);
			while (rset.next()) {
		        count=rset.getInt(1);
		      } 
			if(count!=6) {
				for(int i=0;i<number;i++) {
					sql = "INSERT INTO carslot (id) VALUES ("+i+");" ;
					rs=stm.executeUpdate(sql);
				}
			}else
				return "already created";
			
			if(rs>0) {
				return "Success";
			}else {
				return "not created";
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return e.getMessage();
		} 
		
	}

	@Override
	public String insertvalues(String carNumber, String color) {
		
		return color;
		
	}

}

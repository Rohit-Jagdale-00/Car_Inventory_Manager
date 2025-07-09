package dao;

import util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CarDAO {
	
	 static String tbl="cars"; 
		
	 public static void addCar(int car_id,String make, String model, double price, String status, int year) {
	        String query = "INSERT INTO " + tbl + " (car_id ,make, model, price, status, year) VALUES (?, ?, ?, ?, ?, ?)";
	        try (Connection con = DBConnection.getConnection();
	             PreparedStatement pstm = con.prepareStatement(query)) {
	        	pstm.setInt(1, car_id);
	            pstm.setString(2, make);
	            pstm.setString(3, model);
	            pstm.setDouble(4, price);
	            pstm.setString(5, status);
	            pstm.setInt(6, year);
	            
	            pstm.executeUpdate();
	            System.out.println("Data inserted into table "+tbl);
	        } catch (SQLException e) { e.printStackTrace(); }
	    }
      
	 public static void getAllCars(){
		 String sql="Select * from "+tbl;
		 try(Connection con =DBConnection.getConnection();
				 Statement stm=con.createStatement();
				 ResultSet rs=stm.executeQuery(sql)){
			System.out.println("\n\nData from "+tbl);
			 while(rs.next()) {
				 System.out.println(rs.getInt("car_id")+"|"+rs.getString("make")+"|"+rs.getString("model")+"|"+rs.getInt("year")+"|"
			                        +rs.getDouble("price")+"|"+rs.getString("status"));
	     	  }
		 }
		 catch(SQLException e) {e.printStackTrace();}
	}
}
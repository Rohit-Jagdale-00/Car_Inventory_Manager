package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.DBConnection;

public class CustomerDAO {

	 static String tbl="customers"; 
		
		 public static void addCustomer(int customerId,String name, String email, String phonenumber, String address) {
		        String query = "INSERT INTO " + tbl + " (customerId, name, email, phonenumber, address) VALUES (?, ?, ?, ?, ?)";
		        try (Connection con = DBConnection.getConnection();
		             PreparedStatement pstm = con.prepareStatement(query)) {
		        	pstm.setInt(1, customerId);
		            pstm.setString(2, name);
		            pstm.setString(3, email);
		            pstm.setString(4, phonenumber);
		            pstm.setString(5, address);
		            pstm.executeUpdate();
		            System.out.println("Data inserted into table "+tbl);
		        } catch (SQLException e) { e.printStackTrace(); }
		    }
	      
		 public static void getAllCustomer(){
			 String sql="Select * from "+tbl;
			 try(Connection con =DBConnection.getConnection();
					 Statement stm=con.createStatement();
					 ResultSet rs=stm.executeQuery(sql)){
				System.out.println("\n\nData from "+tbl);
				 while(rs.next()) {
					 System.out.println(rs.getInt("customerId")+"|"+rs.getString("name")+"|"+rs.getString("email")+"|"+rs.getString("phonenumber")+"|"+rs.getString("address"));				                  
				 }
			 }
			 catch(SQLException e) {e.printStackTrace();}
		}
	}

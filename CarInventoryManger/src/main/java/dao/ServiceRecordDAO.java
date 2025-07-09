package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.DBConnection;

public class ServiceRecordDAO {
			
		 static String tbl="servicerecords"; 
		
		 public static void addService(int recordId, Date serviceDate, String description, double cost) {
		        String query = "INSERT INTO " + tbl + " (recordId,  serviceDate, description, cost) VALUES (?, ?, ?, ?)";
		        try (Connection con = DBConnection.getConnection();
		             PreparedStatement pstm = con.prepareStatement(query)) {
		        	pstm.setInt(1, recordId);
		        	pstm.setDate(3, serviceDate);
		        	pstm.setString(4, description);
		        	pstm.setDouble(5, cost);
		            
		            pstm.executeUpdate();
		            System.out.println("Data inserted into table "+tbl);
		        } catch (SQLException e) { e.printStackTrace(); }
		    }
	      
		 public static void getAllServices(){
			 String sql="Select * from "+tbl;
			 try(Connection con =DBConnection.getConnection();
					 Statement stm=con.createStatement();
					 ResultSet rs=stm.executeQuery(sql)){
				System.out.println("\n\nData from "+tbl);
				 while(rs.next()) {
					 System.out.println(rs.getInt("recordId")+"|"+rs.getDate("serviceDate")+"|"+rs.getString("description")+"|"
				                        +rs.getDouble("cost"));
		     	  }
			 }
			 catch(SQLException e) {e.printStackTrace();}
		}
	}

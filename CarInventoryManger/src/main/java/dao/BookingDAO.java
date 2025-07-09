 package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import util.DBConnection;

public class BookingDAO {
		
		 static String tbl="bookings"; 
		
		 public static void addBookings(int bookingId, int car_id, int customerId, Date bookingDate, Date returnDate,
					String status) {
		        String query = "INSERT INTO " + tbl + " (bookingId, car_id, customerId, bookingDate, returnDate, status) VALUES (?, ?, ?, ?, ?, ?)";
		        try (Connection con = DBConnection.getConnection();
		             PreparedStatement pstm = con.prepareStatement(query)) {
		        	pstm.setInt(1, bookingId);
		            pstm.setInt(2, car_id);
		            pstm.setInt(3, customerId);
		            pstm.setDate(4, bookingDate);
		            pstm.setDate(5, returnDate);
		            pstm.setString(6, status);
		            
		            pstm.executeUpdate();
		            System.out.println("Data inserted into table "+tbl);
		        } catch (SQLException e) { e.printStackTrace(); }
		    }
	      
		 public static void getAllBookings(){
			 String sql="Select * from "+tbl;
			 try(Connection con =DBConnection.getConnection();
					 Statement stm=con.createStatement();
					 ResultSet rs=stm.executeQuery(sql)){
				System.out.println("\n\nData from "+tbl);
				 while(rs.next()) {
					 System.out.println(rs.getInt("bookingId")+"|"+rs.getInt("car_id")+"|"+rs.getInt("customerId")+"|"+
				 rs.getDate("bookingDate")+"|"+rs.getDate("returnDate")+"|"+rs.getString("status"));
		     	  }
			 }
			 catch(SQLException e) {e.printStackTrace();}
		}
		 
		 public static void deleteBooking(int bookingId) {
			 String query="Delete from "+tbl+" WHERE bookingId = ?";
			 try(Connection con=DBConnection.getConnection();
					 PreparedStatement pstm=con.prepareStatement(query);){
				      pstm.setInt(1, bookingId);
				     pstm.executeUpdate();
				      System.out.println("Booking Deleted with ID:"+bookingId);
			 } catch (SQLException e) {e.printStackTrace();}
		 }
	}

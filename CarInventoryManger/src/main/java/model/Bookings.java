package model;

import java.sql.Date;

public class Bookings {

	private int bookingId;
	private int carId;
	private int customerId;
	private Date bookingDate;
	private Date returnDate;
	private String status;
	
	public Bookings(int bookingId, int carId, int customerId, Date bookingDate, Date returnDate,
			String status) {
		this.bookingId = bookingId;
		this.carId = carId;
		this.customerId = customerId;
		this.bookingDate = bookingDate;
		this.returnDate = returnDate;
		this.status = status;
	}
	
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public Date getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", carId=" + carId + ", customerId=" + customerId + ", bookingDate="
				+ bookingDate + ", returnDate=" + returnDate + ", status=" + status + "]";
	}
}

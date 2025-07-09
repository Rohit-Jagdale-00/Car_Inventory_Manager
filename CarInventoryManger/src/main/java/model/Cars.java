package model;

public class Cars {


	private int car_id;
	private String make;
	private String model;
	private int year;
	private double price;
	private String status;
	
	public Cars(int car_id, String make, String model, int year, double price, String status) {
		this.car_id = car_id;
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
		this.status = status;
	}


	public int getCarId() {
		return car_id;
	}
	public void setCarId(int carId) {
		this.car_id = carId;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

	@Override
	public String toString() {
		return "car [car_id=" + car_id + ", make=" + make + ", model=" + model + ", year=" + year + ", price=" + price
				+ ", status=" + status + "]";
	}
}

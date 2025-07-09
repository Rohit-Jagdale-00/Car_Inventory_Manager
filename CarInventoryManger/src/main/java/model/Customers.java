package model;

public class Customers {

	private int customerId;
	private String name;
	private String email;
	private String phonenumber;
	private String address;
	
	
	
	public Customers(int customerId, String name, String email, String phonenumber, String address) {
		this.customerId = customerId;
		this.name = name;
		this.email = email;
		this.phonenumber = phonenumber;
		this.address = address;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "customer [customerId=" + customerId + ", name=" + name + ", email=" + email + ", phonenumber="
				+ phonenumber + ", address=" + address + "]";
	}
}

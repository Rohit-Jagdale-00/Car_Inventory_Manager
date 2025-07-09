package model;

import java.sql.Date;

public class ServiceRecords {

	private int recordId;
	private Date serviceDate;
	private String descripton;
	private double cost;
	
	public ServiceRecords(int recordId, Date serviceDate, String descripton, double cost) {
		this.recordId = recordId;
		this.serviceDate = serviceDate;
		this.descripton = descripton;
		this.cost = cost;
	}
	
	public int getRecordId() {
		return recordId;
	}
	public void setRecordId(int recordId) {
		this.recordId = recordId;
	}
	public Date getServiceDate() {
		return serviceDate;
	}
	public void setServiceDate(Date serviceDate) {
		this.serviceDate = serviceDate;
	}
	public String getDescripton() {
		return descripton;
	}
	public void setDescripton(String descripton) {
		this.descripton = descripton;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "ServiceRecord [recordId=" + recordId + ", serviceDate=" + serviceDate
				+ ", descripton=" + descripton + ", cost=" + cost + "]";
	}
	
	
}

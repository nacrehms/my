package com.nacre.hospitalmanagementsystem.dto;

import java.io.Serializable;

public class BillingDto implements Serializable{

	private int billId;
	private String patientName;
	private int totalAmount;
	private int patientId;
	
	
	public int getBillId() {
		return billId;
	}


	public void setBillId(int billId) {
		this.billId = billId;
	}


	public String getPatientName() {
		return patientName;
	}


	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}


	public int getTotalAmount() {
		return totalAmount;
	}


	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}


	public int getPatientId() {
		return patientId;
	}


	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}


	@Override
	public String toString() {
		return "BillingDto [billId=" + billId + ", patientName=" + patientName + ", totalAmount=" + totalAmount
				+ ", patientId=" + patientId + "]";
	}
	
	
	
	
	
}

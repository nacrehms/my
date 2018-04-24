package com.nacre.hospitalmanagementsystem.dto;

import java.io.Serializable;
import java.util.Date;

public class PatientPaymentDetails implements Serializable{

	private int paymentId;
	private int totalAmount;
	private String duePayment;
	private Date paymentDate;
	private int patientId;
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getDuePayment() {
		return duePayment;
	}
	public void setDuePayment(String duePayment) {
		this.duePayment = duePayment;
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	@Override
	public String toString() {
		return "PatientPaymentDetails [paymentId=" + paymentId + ", totalAmount=" + totalAmount + ", duePayment="
				+ duePayment + ", paymentDate=" + paymentDate + ", patientId=" + patientId + "]";
	}
	

}

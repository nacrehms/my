package com.nacre.hospitalmanagementsystem.dto;

import java.io.Serializable;
import java.util.Date;

public class AppointmentDto implements Serializable{

	private int appointmentId;
	private String patientName;
	private String doctorName;
	private Date dateOfAppointment;
	private String diseaseDesc;
	private int fee;
	private int statusId;
	private int patientId;
	public int getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public Date getDateOfAppointment() {
		return dateOfAppointment;
	}
	public void setDateOfAppointment(Date dateOfAppointment) {
		this.dateOfAppointment = dateOfAppointment;
	}
	public String getDiseaseDesc() {
		return diseaseDesc;
	}
	public void setDiseaseDesc(String diseaseDesc) {
		this.diseaseDesc = diseaseDesc;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public int getStatusId() {
		return statusId;
	}
	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	@Override
	public String toString() {
		return "AppointmentDto [appointmentId=" + appointmentId + ", patientName=" + patientName + ", doctorName="
				+ doctorName + ", dateOfAppointment=" + dateOfAppointment + ", diseaseDesc=" + diseaseDesc + ", fee="
				+ fee + ", statusId=" + statusId + ", patientId=" + patientId + "]";
	}
	
	
}

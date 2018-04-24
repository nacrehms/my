package com.nacre.hospitalmanagementsystem.dto;

import java.io.Serializable;
import java.util.Date;

public class PatientDto implements Serializable{

	private int patientId;
	private String patirntName;
	private String patientEmail;
	private String password;
	private long phone;
	private String sex;
	private Date dob;
	private int age;
	private String bloodGroup;
	private int addressId;
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatirntName() {
		return patirntName;
	}
	public void setPatirntName(String patirntName) {
		this.patirntName = patirntName;
	}
	public String getPatientEmail() {
		return patientEmail;
	}
	public void setPatientEmail(String patientEmail) {
		this.patientEmail = patientEmail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	@Override
	public String toString() {
		return "PatientDto [patientId=" + patientId + ", patirntName=" + patirntName + ", patientEmail=" + patientEmail
				+ ", password=" + password + ", phone=" + phone + ", sex=" + sex + ", dob=" + dob + ", age=" + age
				+ ", bloodGroup=" + bloodGroup + ", addressId=" + addressId + "]";
	}
	
	
}

package com.nacre.hospitalmanagementsystem.dto;

import java.io.Serializable;

public class Nurse implements Serializable{

	private int nurseId;
	private String nurseName;
	private long mobileNo;
	private int addressId;
	public int getNurseId() {
		return nurseId;
	}
	public void setNurseId(int nurseId) {
		this.nurseId = nurseId;
	}
	public String getNurseName() {
		return nurseName;
	}
	public void setNurseName(String nurseName) {
		this.nurseName = nurseName;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	@Override
	public String toString() {
		return "Nurse [nurseId=" + nurseId + ", nurseName=" + nurseName + ", mobileNo=" + mobileNo + ", addressId="
				+ addressId + "]";
	}

}

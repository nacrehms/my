package com.nacre.hospitalmanagementsystem.dto;

import java.io.Serializable;

public class GetAllCountryListDto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6262467158476260908L;
	private Integer countryId;
	private String countryName;
	public Integer getCountryId() {
		return countryId;
	}
	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	@Override
	public String toString() {
		return "GetAllCountryListDto [countryId=" + countryId + ", countryName=" + countryName + "]";
	}

	
}

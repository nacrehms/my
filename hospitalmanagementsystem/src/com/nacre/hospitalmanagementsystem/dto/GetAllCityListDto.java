package com.nacre.hospitalmanagementsystem.dto;

import java.io.Serializable;

public class GetAllCityListDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	
	
private Integer cityId;
private String cityName;
public Integer getCityId() {
	return cityId;
}
public void setCityId(Integer cityId) {
	this.cityId = cityId;
}
public String getCityName() {
	return cityName;
}
public void setCityName(String cityName) {
	this.cityName = cityName;
}
@Override
public String toString() {
	return "GetAllCityListDto [cityId=" + cityId + ", cityName=" + cityName + "]";
}

}

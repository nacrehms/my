package com.nacre.hospitalmanagementsystem.queryconstants;

public class SQLQueryConstants {
	
	public static final String COUNTRY_QUERY="SELECT * FROM COUNTRY_MASTER";
	public static final String STATE_QUERY="SELECT STATEID , STATE_NAME FROM STATE_MASTER WHERE COUNTRYID=? ";
	public static final String CITY_QUERY="SELECT CITYID , CITY_NAME FROM CITY_MASTER  WHERE STATEID=?";
	
	

}

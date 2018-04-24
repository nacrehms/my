package com.nacre.hospitalmanagementsystem.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class GetDBConection {

	public static Connection connection;
	public static InputStream file;
	public static GetDBConection getDBConection;

	private GetDBConection() {
		// no logic... do not remove it...
	}

	public static GetDBConection getInstance() {
		if (getDBConection == null) {
			getDBConection = new GetDBConection();
		}

		return getDBConection;
	}

	public Connection getConnection() {
		String DRIVERNAME = null;
		String URL = null;
		String USERNAME = null;
		String PASSWORD = null;
		InputStream file = null;

		Properties props = new Properties();
		try {

			file = GetDBConection.class.getClassLoader()
					.getResourceAsStream("/com/nacre/hospitalmanagementsystem/commons/application.properties");
			// System.out.println(file.available());
			props.load(file);

			DRIVERNAME = props.getProperty("DRIVERNAME");
			URL = props.getProperty("URL");
			USERNAME = props.getProperty("USERNAME");
			PASSWORD = props.getProperty("PASSWORD");

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// System.out.println(DRIVERNAME+" = "+URL+" = "+USERNAME+" = "+PASSWORD);

		try {

			Class.forName(DRIVERNAME);
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

		} catch (SQLException e) {
			// TODO Auto-generated catch block

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return connection;
	}

	public static void main(String[] args) {

		/*
		 * Connection connection = GetDBConection.getConnection();
		 * 
		 * if(connection!=null) System.out.println("connected...!"); }
		 */
	}
}

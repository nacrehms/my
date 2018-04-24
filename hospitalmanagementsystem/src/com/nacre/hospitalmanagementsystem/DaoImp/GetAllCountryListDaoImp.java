package com.nacre.hospitalmanagementsystem.DaoImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.nacre.hospitalmanagementsystem.DaoI.GetAllCountryListDaoI;
import com.nacre.hospitalmanagementsystem.dto.GetAllCountryListDto;
import com.nacre.hospitalmanagementsystem.queryconstants.SQLQueryConstants;
import com.nacre.hospitalmanagementsystem.util.GetDBConection;

public class GetAllCountryListDaoImp implements GetAllCountryListDaoI {

	public GetDBConection getDBConection = GetDBConection.getInstance();

	public Connection connection = getDBConection.getConnection();

	public PreparedStatement statement = null;
	public ResultSet resultSet = null;

	public List<GetAllCountryListDto> listOfCountry = null;
	public GetAllCountryListDto countryDto = null;

	@Override
	public List<GetAllCountryListDto> getAllCountryListDao() {
		try {
			statement = connection.prepareStatement(SQLQueryConstants.COUNTRY_QUERY);
			resultSet = statement.executeQuery();
			listOfCountry = new ArrayList<GetAllCountryListDto>();
			while (resultSet.next()) {
				countryDto = new GetAllCountryListDto();
				countryDto.setCountryId(resultSet.getInt(1));
				countryDto.setCountryName(resultSet.getString(2));
				listOfCountry.add(countryDto);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listOfCountry;
	}

}

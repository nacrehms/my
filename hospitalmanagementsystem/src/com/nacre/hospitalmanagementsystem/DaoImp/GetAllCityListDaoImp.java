package com.nacre.hospitalmanagementsystem.DaoImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import com.nacre.hospitalmanagementsystem.DaoI.GetAllCityListDaoI;
import com.nacre.hospitalmanagementsystem.dto.GetAllCityListDto;
import com.nacre.hospitalmanagementsystem.queryconstants.SQLQueryConstants;
import com.nacre.hospitalmanagementsystem.util.GetDBConection;

public class GetAllCityListDaoImp implements GetAllCityListDaoI {


	GetDBConection getDBConection = GetDBConection.getInstance();
	Connection connection = getDBConection.getConnection();
	PreparedStatement preparedStatement = null;
	ResultSet resultSet = null;
	public List<GetAllCityListDto> listOfCity = new ArrayList<GetAllCityListDto>();

	@Override
	public List<GetAllCityListDto> getAllCityListDao(Integer stateId) {

		try {
			preparedStatement = connection.prepareStatement(SQLQueryConstants.CITY_QUERY);
			preparedStatement.setInt(1, stateId);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				GetAllCityListDto allCityListDto = new GetAllCityListDto();

		allCityListDto.setCityId(resultSet.getInt(1));

				allCityListDto.setCityName(resultSet.getString(2));

				listOfCity.add(allCityListDto);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listOfCity;
	}

}

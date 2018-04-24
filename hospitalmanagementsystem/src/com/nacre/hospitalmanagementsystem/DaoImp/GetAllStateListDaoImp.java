package com.nacre.hospitalmanagementsystem.DaoImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.nacre.hospitalmanagementsystem.DaoI.GetAllStateListDaoI;

import com.nacre.hospitalmanagementsystem.dto.GetAllStateListDto;
import com.nacre.hospitalmanagementsystem.queryconstants.SQLQueryConstants;
import com.nacre.hospitalmanagementsystem.util.GetDBConection;

public class GetAllStateListDaoImp implements GetAllStateListDaoI {

	public GetDBConection getDBConection = GetDBConection.getInstance();
	public Connection connection = getDBConection.getConnection();
	public PreparedStatement statement = null;
	public ResultSet resultSet = null;

	public List<GetAllStateListDto> listOfState = null;
	public GetAllStateListDto stateList=null;
	

	@Override
	public List<GetAllStateListDto> getAllStateListDao(Integer countryId) {
	try {

			statement = connection.prepareStatement(SQLQueryConstants.STATE_QUERY);
			statement.setInt(1, countryId);
			resultSet = statement.executeQuery();
			listOfState = new ArrayList<GetAllStateListDto>();
			while (resultSet.next()) {
				stateList = new GetAllStateListDto();
				stateList.setStateid(resultSet.getInt(1));
				stateList.setStateName(resultSet.getString(2));
				listOfState.add(stateList);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listOfState;
	}

}

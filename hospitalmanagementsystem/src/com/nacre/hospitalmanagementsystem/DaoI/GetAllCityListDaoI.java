package com.nacre.hospitalmanagementsystem.DaoI;

import java.util.List;

import com.nacre.hospitalmanagementsystem.dto.GetAllCityListDto;

public interface GetAllCityListDaoI {
	
	public List<GetAllCityListDto> getAllCityListDao(Integer stateId);
	

}

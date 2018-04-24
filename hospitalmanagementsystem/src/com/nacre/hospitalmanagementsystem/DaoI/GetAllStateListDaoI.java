package com.nacre.hospitalmanagementsystem.DaoI;

import java.util.List;

import com.nacre.hospitalmanagementsystem.dto.GetAllStateListDto;

public interface GetAllStateListDaoI {
	
	public List<GetAllStateListDto> getAllStateListDao(Integer countryId);

}

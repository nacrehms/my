package com.nacre.hospitalmanagementsystem.serviceI;

import java.util.List;

import com.nacre.hospitalmanagementsystem.dto.GetAllStateListDto;

public interface GetAllStateListServiceI {
	
	public List<GetAllStateListDto> getAllStateListService(Integer countryId);

}

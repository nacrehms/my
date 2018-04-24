package com.nacre.hospitalmanagementsystem.serviceI;

import java.util.List;

import com.nacre.hospitalmanagementsystem.dto.GetAllCityListDto;

public interface GetAllCityListServiceI {
public List<GetAllCityListDto> getAllCityListService(Integer stateId);
}

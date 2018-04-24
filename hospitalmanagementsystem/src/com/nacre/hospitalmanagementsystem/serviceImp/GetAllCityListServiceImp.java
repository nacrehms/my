package com.nacre.hospitalmanagementsystem.serviceImp;

import java.util.List;

import com.nacre.hospitalmanagementsystem.DaoI.GetAllCityListDaoI;
import com.nacre.hospitalmanagementsystem.DaoImp.GetAllCityListDaoImp;
import com.nacre.hospitalmanagementsystem.dto.GetAllCityListDto;
import com.nacre.hospitalmanagementsystem.serviceI.GetAllCityListServiceI;

public class GetAllCityListServiceImp implements GetAllCityListServiceI{

	
public	List<GetAllCityListDto> listOfCity=null;

@Override
public List<GetAllCityListDto> getAllCityListService(Integer stateId) {
	
	GetAllCityListDaoI getAllCityListDaoI=new GetAllCityListDaoImp(); 
	listOfCity=getAllCityListDaoI.getAllCityListDao(stateId);
	
	return listOfCity;
}
	
	

}

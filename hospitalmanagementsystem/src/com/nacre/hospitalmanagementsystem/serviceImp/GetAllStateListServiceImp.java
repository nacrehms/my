package com.nacre.hospitalmanagementsystem.serviceImp;

import java.util.List;

import com.nacre.hospitalmanagementsystem.DaoI.GetAllStateListDaoI;
import com.nacre.hospitalmanagementsystem.DaoImp.GetAllStateListDaoImp;
import com.nacre.hospitalmanagementsystem.dto.GetAllStateListDto;
import com.nacre.hospitalmanagementsystem.serviceI.GetAllStateListServiceI;

public class GetAllStateListServiceImp implements GetAllStateListServiceI {

	List<GetAllStateListDto> listOfState = null;

	@Override
	public List<GetAllStateListDto> getAllStateListService(Integer countryId) {

		GetAllStateListDaoI getAllStateListDaoI = new GetAllStateListDaoImp();

		listOfState = getAllStateListDaoI.getAllStateListDao(countryId);

		return listOfState;

	}

}

package com.nacre.hospitalmanagementsystem.serviceImp;


import java.util.List;

import com.nacre.hospitalmanagementsystem.DaoI.GetAllCountryListDaoI;
import com.nacre.hospitalmanagementsystem.DaoImp.GetAllCountryListDaoImp;
import com.nacre.hospitalmanagementsystem.dto.GetAllCountryListDto;
import com.nacre.hospitalmanagementsystem.serviceI.GetAllCountryListServiceI;

public class GetAllCountryListServiceImp  implements GetAllCountryListServiceI{

	
	
	
	public List<GetAllCountryListDto> listOfCountry=null;
	
	
	
	@Override
	public List<GetAllCountryListDto> getAllCountryListService() {
		
		GetAllCountryListDaoI allCountryListDaoI=new GetAllCountryListDaoImp();
		
		listOfCountry=allCountryListDaoI.getAllCountryListDao();
		
		return listOfCountry;
	}




}

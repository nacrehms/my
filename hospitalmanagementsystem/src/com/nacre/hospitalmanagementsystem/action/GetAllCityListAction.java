package com.nacre.hospitalmanagementsystem.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.nacre.hospitalmanagementsystem.dto.GetAllCityListDto;
import com.nacre.hospitalmanagementsystem.serviceI.GetAllCityListServiceI;
import com.nacre.hospitalmanagementsystem.serviceImp.GetAllCityListServiceImp;

@WebServlet("/getAllCityListAction")
public class GetAllCityListAction extends HttpServlet {
	
	public List<GetAllCityListDto> listOfCity=null;
	
	private static final long serialVersionUID = 1L;
	
	
   
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	String stateId1=request.getParameter("stateId");
	
	Integer stateId=Integer.parseInt(stateId1);
		
		
		
		

		listOfCity = getAllCityList(stateId);
		System.out.println(".........state.........."+listOfCity);

		Gson gjon = new Gson();

		String state = gjon.toJson(listOfCity);

		response.getWriter().write(state);

		
		
	
	}

	
	
	
	
	public List<GetAllCityListDto>  getAllCityList(Integer stateId)
	{
		
		GetAllCityListServiceI getAllCityListServiceI=new GetAllCityListServiceImp(); 
		
		listOfCity=getAllCityListServiceI.getAllCityListService(stateId);
		return listOfCity; 
		
	}
	
	
	
	

}

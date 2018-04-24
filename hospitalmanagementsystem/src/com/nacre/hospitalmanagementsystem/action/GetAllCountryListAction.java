package com.nacre.hospitalmanagementsystem.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.nacre.hospitalmanagementsystem.dto.GetAllCountryListDto;
import com.nacre.hospitalmanagementsystem.serviceI.GetAllCountryListServiceI;
import com.nacre.hospitalmanagementsystem.serviceImp.GetAllCountryListServiceImp;

/**
 * Servlet implementation class GetAllCountryList
 */
@WebServlet("/getCountryList")
public class GetAllCountryListAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public List<GetAllCountryListDto> listOfCountry = null;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("Application/json");

		// getting all country from database...
		listOfCountry = getAllCountry();

		
		System.out.println("................"+listOfCountry);
		Gson gjon = new Gson();

		String country = gjon.toJson(listOfCountry);

		response.getWriter().write(country);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	public List<GetAllCountryListDto> getAllCountry() {

		GetAllCountryListServiceI getListOfCountry = new GetAllCountryListServiceImp();
		listOfCountry = getListOfCountry.getAllCountryListService();

		return listOfCountry;

	}

}

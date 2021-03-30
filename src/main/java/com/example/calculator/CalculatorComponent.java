package com.example.calculator;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.calculator.Calculator;
import com.example.calculator.ResponseService;

@Path("calc")
@Component
public class CalculatorComponent {
	
	@Autowired
	private ResponseService responseService;
	
	@Path("add")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Calculator getAdd(@QueryParam("firstNumber") int firstNumber, 
			@QueryParam("secondNumber") int secondNumber) {
		return responseService.getAdd(firstNumber, secondNumber);
	}
	
	@Path("sub")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Calculator getSub(@QueryParam("firstNumber") int firstNumber, 
			@QueryParam("secondNumber") int secondNumber) {
		return responseService.getSub(firstNumber, secondNumber);
	}
	
	
	@Path("mul")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Calculator getMulTiply(@QueryParam("firstNumber") int firstNumber, 
			@QueryParam("secondNumber") int secondNumber) {
		return responseService.getMultiply(firstNumber, secondNumber);
	}
	
	@Path("div")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Calculator getDevide(@QueryParam("firstNumber") int firstNumber, 
			@QueryParam("secondNumber") int secondNumber) {
		return responseService.getDevide(firstNumber, secondNumber);
	}
	
}

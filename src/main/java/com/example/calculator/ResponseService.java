package com.example.calculator;

import org.springframework.stereotype.Service;

import com.example.calculator.Calculator;
import com.example.calculator.Response;

@Service
public class ResponseService implements Response{
	
	@Override
	public Calculator getAdd(final int firstNumber , final int secondNumber) {
		Calculator response = new Calculator(firstNumber, secondNumber, 0 , "+");
		response.setAnswer(firstNumber + secondNumber);
		return response;
	}
	
	@Override
	public Calculator getSub(final int firstNumber , final int secondNumber) {
		Calculator response = new Calculator(firstNumber, secondNumber, 0 , "-");
		response.setAnswer(firstNumber - secondNumber);
		return response;
	}

    @Override
	public Calculator getMultiply(final int firstNumber , final int secondNumber) {
		Calculator response = new Calculator(firstNumber, secondNumber, 0 , "*");
		response.setAnswer(firstNumber * secondNumber);
		return response;
	}
	
	@Override
	public Calculator getDevide(final int firstNumber , final int secondNumber) {
		Calculator response = new Calculator(firstNumber, secondNumber, 0 , "/");
		try {
			response.setAnswer(firstNumber / secondNumber);
			return response;
		}catch(ArithmeticException e) {
			e.printStackTrace();
			return response;
		}
	}
	
	 class ResponseServiceException extends RuntimeException{
		ResponseServiceException(final String message){
			super(message);
		}
	}

}

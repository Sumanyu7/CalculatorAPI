package com.example.calculator;

import com.example.calculator.Calculator;

public interface Response {
	
	Calculator getAdd(int firstNumber, int SecondNumber);
	Calculator getSub(int firstNumber, int SecondNumber);
	Calculator getMultiply(int firstNumber, int SecondNumber);
	Calculator getDevide(int firstNumber, int SecondNumber);

}

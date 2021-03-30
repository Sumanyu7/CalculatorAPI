package com.example.calculator;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Calculator {
	
	private int firstNumber;
	private int secondNumber;
	private int answer;
	private String operator;
	
	public Calculator(){
		super();
	}
	
	public Calculator(int firstNumber, int secondNumber, int answer, String operator) {
		this();
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.answer = answer;
		this.operator = operator;
	}

	public int getFirstNumber() {
		return firstNumber;
	}
	
	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}
	
	public int getSecondNumber() {
		return secondNumber;
	}
	
	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}
	
	public int getAnswer() {
		return answer;
	}
	
	public void setAnswer(int answer) {
		this.answer = answer;
	}
	
	public String getOperator() {
		return operator;
	}
	
	public void setOperator(String operator) {
		this.operator = operator;
	}

}

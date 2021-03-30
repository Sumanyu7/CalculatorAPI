# CalculatorAPI

A simple Calculator capable of basic arithmetic operations built using Spring Boot.

## To Run
```
Install Java 11 JDK
Then Run this command in terminal - 
./mvnw spring-boot:run
```
### GET Request Example
> http://localhost:8080/calc/add?firstNumber=10&secondNumber=3.   

Expected Response -   
{"firstNumber":10,"secondNumber":3,"answer":13,"operator":"+"}     

Other operations - "sub", "mul", "div"

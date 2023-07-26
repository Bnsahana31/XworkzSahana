package com.xworkz.object.runner;

import com.xworkz.object.app.CIsScientific;
import com.xworkz.object.app.Calculator;

public class CalculatorRunner {

	public static void main(String[] args) {
		System.out.println("Runnig in main");
		
		Calculator calculator=new Calculator();
		
		System.out.println(calculator.toString());
		calculator.setBrand("Calculator Co");
		calculator.setDisplay_size("ScientificCalc 2000");
		calculator.is_scientific=CIsScientific.TRUE;
		calculator.setColor("blue");
		calculator.setPrice(1250);
		
		System.out.println("***************************");
		
		System.out.println(calculator.toString());	
		
	}

}

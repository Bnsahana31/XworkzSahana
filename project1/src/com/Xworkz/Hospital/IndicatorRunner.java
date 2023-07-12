package com.Xworkz.Hospital;

public class IndicatorRunner {

	public static void main(String[] args) {
		System.out.println("running main in IndicatorRunner");
		
		Indicator.methodStatic();
		Indicator instance1=new Indicator(true);
		instance1.display();
		
		Indicator instance2=new Indicator(false);
		instance2.display();



	}

}

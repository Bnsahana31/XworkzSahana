package com.Xworkz.Hospital;

public class NumberPlate {
	static  String country;
     String code;


	static void methodStatic()
	{
		country="USA";
	}
	NumberPlate( String code)
	{
		this.code=code;
		
	}
	void display() {
	        System.out.println("Static Variable: " + country);
	        System.out.println("Instance Variable: " + code);
	}

}

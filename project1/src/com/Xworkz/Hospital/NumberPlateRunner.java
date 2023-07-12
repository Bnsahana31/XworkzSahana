package com.Xworkz.Hospital;

public class NumberPlateRunner {

	public static void main(String[] args) {
		System.out.println("running main in NumberPlateRunner");
		
		NumberPlate.methodStatic();
		NumberPlate instance1=new NumberPlate("ABC123");
		instance1.display();
		
		NumberPlate instance2=new NumberPlate("XYZ789");
		instance2.display();



	}

}

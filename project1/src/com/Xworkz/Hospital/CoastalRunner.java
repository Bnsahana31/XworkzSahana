package com.Xworkz.Hospital;

public class CoastalRunner {

	public static void main(String[] args) {
		System.out.println("running main in CoastalRunner");
		
		Coastal.methodStatic();
		Coastal instance1=new Coastal(300);
		instance1.display();
		
		Coastal instance2=new Coastal(450);
		instance2.display();


	}

}

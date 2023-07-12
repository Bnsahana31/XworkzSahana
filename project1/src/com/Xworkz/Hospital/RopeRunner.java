package com.Xworkz.Hospital;

public class RopeRunner {

	public static void main(String[] args) {
		System.out.println("running main in RopeRunner");
		
		Rope.methodStatic();
		Rope instance1=new Rope(15);
		instance1.display();
		
		Rope instance2=new Rope(10);
		instance2.display();
		

	}

}

package com.Xworkz.Hospital;

public class VaccumRunner {

	public static void main(String[] args) {
		System.out.println("running main in VaccumRunner");
		
		Vaccum.methodStatic();
		Vaccum instance1=new Vaccum(75);
		instance1.display();
		
		Vaccum instance2=new Vaccum(80);
		instance2.display();
		

	}

}

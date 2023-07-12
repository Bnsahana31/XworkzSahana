package com.Xworkz.Hospital;

public class SubmarineRunner {

	public static void main(String[] args) {
		System.out.println("running main in SubmarineRunner");
		
		Submarine.methodStatic();
		Submarine instance1=new Submarine(500);
		instance1.display();
		
		Submarine instance2=new Submarine(600);
		instance2.display();

		

	}

}

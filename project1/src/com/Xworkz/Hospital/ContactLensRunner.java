package com.Xworkz.Hospital;

public class ContactLensRunner {

	public static void main(String[] args) {
		System.out.println("running main in ContactLensRunner");
		
		ContactLens.methodStatic();
		ContactLens instance1=new ContactLens("blue");
		instance1.display();
		
		ContactLens instance2=new ContactLens("green");
		instance2.display();


	}

}

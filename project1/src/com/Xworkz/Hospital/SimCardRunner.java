package com.Xworkz.Hospital;

public class SimCardRunner {

	public static void main(String[] args) {
		System.out.println("running main in SimCardRunner");
		
		SimCard.methodStatic();
		SimCard instance1=new SimCard("7788454567");
		instance1.display();
		
		SimCard instance2=new SimCard("8976543289");
		instance2.display();

	}

}

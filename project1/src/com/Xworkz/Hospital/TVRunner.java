package com.Xworkz.Hospital;

public class TVRunner {

	public static void main(String[] args) {
System.out.println("running main in TVRunner");
		
		TV.methodStatic();
		TV instance1=new TV(55);
		instance1.display();
		
		TV instance2=new TV(56);
		instance2.display();
		
	}

}

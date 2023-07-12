package com.Xworkz.Hospital;

public class MotherBoardRunner {

	public static void main(String[] args) {
		System.out.println("running main in MotherBoardRunner");
		
		MotherBoard.methodStatic();
		MotherBoard instance1=new MotherBoard("XYZ123");
		instance1.display();
				
		MotherBoard instance2=new MotherBoard("ABC456");
		instance2.display();

	}

}

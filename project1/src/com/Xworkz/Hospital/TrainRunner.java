package com.Xworkz.Hospital;

public class TrainRunner {

		public static void main(String[] args) {
			System.out.println("running main in TrainRunner");
			
			Train.methodStatic();
			Train instance1=new Train(300);
			instance1.display();
			
			Train instance2=new Train(450);
			instance2.display();

		// TODO Auto-generated method stub

	}

}

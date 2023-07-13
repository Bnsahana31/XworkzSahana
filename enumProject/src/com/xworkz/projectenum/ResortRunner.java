package com.xworkz.projectenum;

public class ResortRunner {

	public static void main(String[] args) {
		
		System.out.println("running main ");
		Resort ref=new Resort("John Doe");
		ref.setBreakfast(true);
		ref.roomType=ResorType.DELUXE;
		ref.display();
		Resort ref1=new Resort("James ");
		ref1.setBreakfast(false);
		ref1.roomType=ResorType.SNG;
		ref1.display();
	}
}

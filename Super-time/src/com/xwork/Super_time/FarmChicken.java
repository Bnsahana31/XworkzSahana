package com.xwork.Super_time;

public class FarmChicken extends Chicken {
	int noOfDays;
	String careTaker;
	
	
	public FarmChicken(int price, String location, int noOfDays, String careTaker) {
		super(price, location);
		this.noOfDays = noOfDays;
		this.careTaker = careTaker;
	}
	void printInfo() {
		super.printInfo();
		System.out.println("the number of days "+noOfDays);
		System.out.println("the take carer " +careTaker);
	}
	public static void main (String[]args)
	{
		Chicken chicken=new Chicken(555,"btm");
		chicken.printInfo();
		
		System.out.println("* * * * * * * * * * * * * * * * *");
		
		Chicken farmChicken=new FarmChicken(12,"mane",5,"manoj");
		farmChicken.printInfo();
		
		System.out.println("* * * * * * * * * * * * * * * * *");

		Chicken boilerChicken=new BoilerChicken(15,"mane",true,7.8); 
		boilerChicken.printInfo();
		
		
		
		
	}
}

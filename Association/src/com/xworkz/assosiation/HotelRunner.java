package com.xworkz.assosiation;

public class HotelRunner {

	public static void main(String[] args) {
		
		System.out.println("running main");
		
		Hotel hotel=new Hotel("Udupi","BTM");
		hotel.setType("veg");
		hotel.displayInfo();

	}

}

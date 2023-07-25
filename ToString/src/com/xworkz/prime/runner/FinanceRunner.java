package com.xworkz.prime.runner;

import com.xworkz.prime.app.Finance;

public class FinanceRunner {

	public static void main(String[] args) {
		System.out.println("Running in main");
		Finance finance=new Finance();
		System.out.println(finance);
		
		Finance finance1=new Finance();
		System.out.println(finance1.toString());
	}

}

package com.xworkz.override;

public class CourtRunner {

	public static void main(String[] args) {
		System.out.println("runing main");
		System.out.println("*************************");
		
		Court ref1=new Court();
		ref1.justice();
		System.out.println("*************************");
		
		SupremeCourt ref2=new SupremeCourt();
		ref2.importantCases();
		ref2.justice();
		System.out.println("*************************");
		
		HighCourt  ref3=new  HighCourt();
		ref3.importantCases();
		ref3.forgery();
		ref3.criminalCases();
		System.out.println("*************************");
		
		CivilCourt ref4=new CivilCourt();
		ref4.forgery();
		ref4.criminalCases();
		ref4.propertyCase();
		ref4.theftCase();
		System.out.println("*************************");
		
		FamilyCourt ref5=new FamilyCourt();
		ref5.DivorceCase();
		ref5.theftCase();
		ref5.propertyCase();
		System.out.println("*************************");
		
	}

}
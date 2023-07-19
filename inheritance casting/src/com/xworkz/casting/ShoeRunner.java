package com.xworkz.casting;

public class ShoeRunner {

	public static void main(String[] args) {
			
			   System.out.println("running main");
			   PumaShoe ref1=new PumaShoe(1500,Size.MAXIMUM,Color.RED,2002,"origin1");
			   ref1.printinfo();
			   
			   NikeShoe ref2=new NikeShoe(2100,Size.MINIMUM,Color.YELLOW,"ceo1","mahi");
			   ref2.printinfo();

	}

}

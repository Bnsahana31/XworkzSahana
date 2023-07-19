package com.xworkz.casting;

public class PumaShoe extends Shoe {
	int model;
	String origin;
	
	PumaShoe(int price,Size size,Color color,int model,String origin)
	{
		super(price,size,color);
		this.model=model;
		this.origin=origin;
		
	}
	
	
	void printinfo()
	{
      
       System.out.println(this.model);
       System.out.println(this.origin);
       System.out.println(price);
		System.out.println(size);
		System.out.println(color);
	}

}

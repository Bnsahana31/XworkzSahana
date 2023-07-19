package com.xworkz.casting;

public class NikeShoe extends Shoe {
	String ceo;
	String brandAmbassador;
	
	NikeShoe(int price,Size size,Color color,String ceo,String brandAmbasidor)
	{
		super(price,size,color);
		this.ceo=ceo;
		this.brandAmbassador=brandAmbasidor;
		
	}
	void printinfo()
	{

		System.out.println(brandAmbassador);
		System.out.println(ceo);
		System.out.println(price);
		System.out.println(size);
		System.out.println(color);
		
	
	}

}

package com.xworkz.casting;

public class ShoeUtil {
	static void buy(Shoe shoe)
	{
		if(shoe != null)
		{
			System.out.println("Running Null");
		
		}
		else
		{
			System.out.println("provide a Valid shoe");
		}
		if(shoe instanceof PumaShoe) 
		{
			System.out.println(" casting for  puma shoe");
	         PumaShoe pumashoe=	(PumaShoe)shoe;  
	         pumashoe.printinfo();
		}
		
		if(shoe instanceof NikeShoe)
		{
			System.out.println(" casting for nike shoe");
			NikeShoe nikeshoe=(NikeShoe)shoe;
			nikeshoe.printinfo();
		}
	
	}

}

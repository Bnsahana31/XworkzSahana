package com.xworkz.isa;

public class Money extends Strength {
    
	  String currency;
	  double amount;

	    public Money(String type, int level, String description, boolean isActive, String currency, double amount) {
	        super(type, level, description, isActive);
	        this.currency = currency;
	        this.amount = amount;
		System.out.println("invoking arg const money ");
	}
	void printInfo()
	{
		System.out.println(type);
		System.out.println(level);
		System.out.println(description);
		System.out.println(isActive);
		System.out.println(currency);
		System.out.println(amount);
		
}

}

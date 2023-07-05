class Money
{
	String country;
	String currency;
	String  denomination;
	String type;
	
	Money(String country)
	{
		System.out.println("the info of money");
		this.country=country;
	}
	Money(String country,String currency)
	{
		this(country);
		this.currency=currency;
	}
	Money(String country,String currency,String denomination)
	{
		this(country,currency);//chaining//
		this.denomination=denomination;
	}
	Money(String country,String currency,String denomination,String type)
	{
		this(country,currency,denomination);
		this.type=type;
	}
}
	
	
	
class MoneyRunner
{
	public static void main(String[]args)
	{
		System.out.println("main running");
		
		Money money =new Money("India");
		System.out.println( money.country);
		
		Money money1 =new Money("India","rupee");
		System.out.println(money1.country);
		System.out.println("The " + money1.country +"n currencyi s " +  money1.currency );
		
		
		Money money2 =new Money("India","rupee","pice");
		System.out.println(money2.country);
		System.out.println("The " + money2.country +"n currency is " +  money2.currency );
		System.out.println("The denomination is " +money2.denomination);
		
		
		Money money3 =new Money("India","rupee","pice","coin");
		System.out.println(money3.country);
		System.out.println("The " + money3.country +"n currency is " +  money3.currency );
		System.out.println("The denomination is " + money3.denomination);
		System.out.println("The of money is " + money3.type);
	}
}

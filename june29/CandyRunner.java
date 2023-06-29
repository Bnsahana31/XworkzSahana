class Candy
{
	String name="Orange";
	int Price=100;
	String type;
    String flavour;
	
	Candy()
	{
	System.out.println("Running const vegpuff");
	}
}
class CandyRunner
{
	public static void main(String[]args)
	{
		System.out.println("Running main method");
		Candy candy =new Candy();
		System.out.println(candy.name);
		System.out.println(candy.Price);
		System.out.println(candy.type);
		System.out.println(candy.flavour);
		
	}
}
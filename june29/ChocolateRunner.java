class Chocolate
{
	String name="dark Chocolate";
	int Price=45;
	String type;
    String flavour;
	
	Chocolate()
	{
	System.out.println("Running const Chocolate");
	}
}
class ChocolateRunner
{
	public static void main(String[]args)
	{
		System.out.println("Running main method");
		Chocolate choco =new Chocolate();
		System.out.println(choco.name);
		System.out.println(choco.Price);
		System.out.println(choco.type);
		System.out.println(choco.flavour);
		
	}
}
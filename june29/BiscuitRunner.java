class Biscuit
{
	String name="Butter biscuit";
	int Price=40;
	String color;
	double weigth;
	
	Biscuit()
	{
	System.out.println("Running const Biscuit");
	}
}
class BiscuitRunner
{
	public static void main(String[]args)
	{
		System.out.println("Running main method");
		Biscuit biscuit =new Biscuit();
		System.out.println(biscuit.name);
		System.out.println(biscuit.Price);
		System.out.println(biscuit.color);
		System.out.println(biscuit.weigth);
		
	}
}
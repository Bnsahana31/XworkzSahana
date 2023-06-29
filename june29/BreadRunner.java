class Bread
{
	String shape="baguette";
	String flavor="whole wheat";
	String texture;
    String crust;
	
	Bread()
	{
	System.out.println("Running const Bread");
	}
}
class BreadRunner
{
	public static void main(String[]args)
	{
		System.out.println("Running main method");
		Bread bread =new Bread();
		System.out.println(bread.shape);
		System.out.println(bread.flavor);
		System.out.println(bread.texture);
		System.out.println(bread.crust);
		
	}
}
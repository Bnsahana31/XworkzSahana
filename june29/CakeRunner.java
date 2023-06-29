class Cake 
{
	String name="Chocolate";
	int Price=25;
	String color;
	double weigth;
	
	Cake()
	{
	System.out.println("Running const Cake");
	}
}
class CakeRunner
{
	public static void main(String[]args)
	{
		System.out.println("Running main method");
		Cake cake =new Cake();
		System.out.println(cake.name);
		System.out.println(cake.Price);
		System.out.println(cake.color);
		System.out.println(cake.weigth);
		
	}
}
class IceCream
{
	String name="chocolate IceCream";
	int Price=90;
	String type;
    String weight;
	
	IceCream()
	{
	System.out.println("Running const IceCream");
	}
}
class IceCreamRunner
{
	public static void main(String[]args)
	{
		System.out.println("Running main method");
		IceCream ice=new IceCream();
		System.out.println(ice.name);
		System.out.println(ice.Price);
		System.out.println(ice.type);
		System.out.println(ice.weight);
		
	}
}
class VegPuff
{
	String name="paneerpuff";
	int Price=25;
	String type;
    String filling;
	
	VegPuff()
	{
	System.out.println("Running const vegpuff");
	}
}
class VegPuffRunner
{
	public static void main(String[]args)
	{
		System.out.println("Running main method");
		VegPuff puff =new VegPuff();
		System.out.println(puff.name);
		System.out.println(puff.Price);
		System.out.println(puff.type);
		System.out.println(puff.filling);
		
	}
}
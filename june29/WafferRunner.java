class Waffer
{
	double weight= 200;
	String flavor="Chocolate";
	int price;
    String filling;
	
	Waffer()
	{
	System.out.println("Running const Waffer");
	}
}
class WafferRunner
{
	public static void main(String[]args)
	{
		System.out.println("Running main method");
		Waffer waffer =new Waffer();
		System.out.println(waffer.weight);
		System.out.println(waffer.flavor);
		System.out.println(waffer.price);
		System.out.println(waffer.filling);
		
	}
}
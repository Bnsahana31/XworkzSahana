class Sweet 
{
	String name="kaju";
	int Prize=10;
	String color;
	double weigth;
	
	Sweet()
	{
	System.out.println("Running const sweet");
	}
}
class SweetRunner
{
	public static void main(String[]args)
	{
		System.out.println("Running main method");
		Sweet sweet=new Sweet();
		System.out.println(sweet.name);
		System.out.println(sweet.Prize);
		System.out.println(sweet.color);
		System.out.println(sweet.weigth);
		
	}
}
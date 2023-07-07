class Plate
{
	String material;
	String color;
	String shape;
	double diameter;
	String pattern;
	int weight;
	String usage;
	int quantity;
	
	Plate(String material,String color,String shape,double diameter,String pattern,int weight,String usage,int quantity)
	{
		this.material = material;
        this.color = color;
        this.shape = shape;
        this.diameter = diameter;
        this.pattern = pattern;
        this.weight = weight;
        this.usage = usage;
        this.quantity = quantity;
	}
}
class PlateRunner
{
	public static void main(String[]args)
	{
		System.out.println("main running");
		Plate plate1 =new Plate("Ceramic", "White", "Round", 10, "Floral", 200, "Dining", 6);
		Plate plate2 =new Plate("Glass", "Transparent", "Square", 12, "Abstract", 150, "Serving", 4);
		Plate plate3 =new Plate("Melamine", "Blue", "Oval", 15, "Striped", 180, "Dining", 8);
		Plate plate4 =new Plate("Porcelain", "Cream", "Round", 8, "Polka Dot", 250, "Decorative", 2);
		Plate plate5 =new Plate("Stoneware", "Green", "Square", 14, "Nature", 300, "Serving", 3);
		Plate plate6 =new Plate("Bone China", "White", "Round", 10, "Gold Trim", 220, "Decorative", 1);
		Plate plate7 =new Plate("Ceramic", "Red", "Oval", 16, "Floral", 190, "Dining", 5);
		Plate plate8 =new Plate("Glass", "Transparent", "Square", 12, "Patterned", 170, "Serving", 4);


		System.out.println(plate1.material);
		System.out.println(plate1.color);
		System.out.println(plate1.shape);
		System.out.println(plate1.diameter);
		System.out.println(plate1.pattern);
		System.out.println(plate1.weight);
		System.out.println(plate1.usage);
		System.out.println(plate1.quantity);
		
		System.out.println(plate2.material);
		System.out.println(plate2.color);
		System.out.println(plate2.shape);
		System.out.println(plate2.diameter);
		System.out.println(plate2.pattern);
		System.out.println(plate2.weight);
		System.out.println(plate2.usage);
		System.out.println(plate2.quantity);

		System.out.println(plate3.material);
		System.out.println(plate3.color);
		System.out.println(plate3.shape);
		System.out.println(plate3.diameter);
		System.out.println(plate3.pattern);
		System.out.println(plate3.weight);
		System.out.println(plate3.usage);
		System.out.println(plate3.quantity);
		
		System.out.println(plate4.material);
		System.out.println(plate4.color);
		System.out.println(plate4.shape);
		System.out.println(plate4.diameter);
		System.out.println(plate4.pattern);
		System.out.println(plate4.weight);
		System.out.println(plate4.usage);
		System.out.println(plate4.quantity);
		
		System.out.println(plate5.material);
		System.out.println(plate5.color);
		System.out.println(plate5.shape);
		System.out.println(plate5.diameter);
		System.out.println(plate5.pattern);
		System.out.println(plate5.weight);
		System.out.println(plate5.usage);
		System.out.println(plate5.quantity);

		System.out.println(plate6.material);
		System.out.println(plate6.color);
		System.out.println(plate6.shape);
		System.out.println(plate6.diameter);
		System.out.println(plate6.pattern);
		System.out.println(plate6.weight);
		System.out.println(plate6.usage);
		System.out.println(plate6.quantity);

		System.out.println(plate7.material);
		System.out.println(plate7.color);
		System.out.println(plate7.shape);
		System.out.println(plate7.diameter);
		System.out.println(plate7.pattern);
		System.out.println(plate7.weight);
		System.out.println(plate7.usage);
		System.out.println(plate7.quantity);

		System.out.println(plate8.material);
		System.out.println(plate8.color);
		System.out.println(plate8.shape);
		System.out.println(plate8.diameter);
		System.out.println(plate8.pattern);
		System.out.println(plate8.weight);
		System.out.println(plate8.usage);
		System.out.println(plate8.quantity);
	}
}



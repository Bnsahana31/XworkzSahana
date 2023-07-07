class Toothpaste
{
	String brand;
	String flavor;
	int size;
	boolean whitening;
	boolean anti_cavity;
	boolean sensitivity;
	String ingredients;
	double price;
	
	Toothpaste(String brand,String flavor,int size,boolean whitening,boolean anti_cavity,boolean sensitivity,String ingredients,double price)
	{
		this.brand = brand;
        this.flavor = flavor;
        this.size = size;
        this.whitening = whitening;
        this.anti_cavity = anti_cavity;
        this.sensitivity = sensitivity;
        this.ingredients = ingredients;
        this.price = price;
	}
}
class ToothpasteRunner
{
	public static void main(String[]args)
	{
		System.out.println("main running");
		Toothpaste toothpaste1 =new Toothpaste("Colgate", "Mint",100, true, true, false, "Fluoride", 2.99);
		Toothpaste toothpaste2 =new Toothpaste("Crest", "Cinnamon",75, false, true, true, "Fluoride", 3.49);
		Toothpaste toothpaste3 =new Toothpaste("Sensodyne", "Fresh Mint",120, false, true, true, "Potassium nitrate", 4.99);
		Toothpaste toothpaste4 =new Toothpaste("Close-Up", "Red Hot",150, true, true, false, "Fluoride", 2.79);
		Toothpaste toothpaste5 =new Toothpaste("Aquafresh", "Extreme Clean",90, true, true, false,"Fluoride",3.29);
		Toothpaste toothpaste6 =new Toothpaste("Arm & Hammer", "Baking Soda",200, true, true, true, "Baking soda", 5.99);
		Toothpaste toothpaste7 =new Toothpaste("Parodontax", "Herbal",75, false, true, true, "Sodium bicarbonate",4.49);
		Toothpaste toothpaste8 =new Toothpaste("Pepsodent", "Triple Protection",100, true, true, false, "Fluoride", 2.49);
		
		
		System.out.println(toothpaste1.brand);
		System.out.println(toothpaste1.flavor);
		System.out.println(toothpaste1.size);
		System.out.println(toothpaste1.whitening);
		System.out.println(toothpaste1.anti_cavity);
		System.out.println(toothpaste1.sensitivity);
		System.out.println(toothpaste1.ingredients);
		System.out.println(toothpaste1.price);
		
		System.out.println(toothpaste2.brand);
		System.out.println(toothpaste2.flavor);
		System.out.println(toothpaste2.size);
		System.out.println(toothpaste2.whitening);
		System.out.println(toothpaste2.anti_cavity);
		System.out.println(toothpaste2.sensitivity);
		System.out.println(toothpaste2.ingredients);
		System.out.println(toothpaste2.price);
		
		System.out.println(toothpaste3.brand);
		System.out.println(toothpaste3.flavor);
		System.out.println(toothpaste3.size);
		System.out.println(toothpaste3.whitening);
		System.out.println(toothpaste3.anti_cavity);
		System.out.println(toothpaste3.sensitivity);
		System.out.println(toothpaste3.ingredients);
		System.out.println(toothpaste3.price);		

		System.out.println(toothpaste4.brand);
		System.out.println(toothpaste4.flavor);
		System.out.println(toothpaste2.size);
		System.out.println(toothpaste4.whitening);
		System.out.println(toothpaste4.anti_cavity);
		System.out.println(toothpaste4.sensitivity);
		System.out.println(toothpaste4.ingredients);
		System.out.println(toothpaste4.price);		

		System.out.println(toothpaste5.brand);
		System.out.println(toothpaste5.flavor);
		System.out.println(toothpaste5.size);
		System.out.println(toothpaste5.whitening);
		System.out.println(toothpaste5.anti_cavity);
		System.out.println(toothpaste5.sensitivity);
		System.out.println(toothpaste5.ingredients);
		System.out.println(toothpaste5.price);
		
		System.out.println(toothpaste6.brand);
		System.out.println(toothpaste6.flavor);
		System.out.println(toothpaste6.size);
		System.out.println(toothpaste6.whitening);
		System.out.println(toothpaste6.anti_cavity);
		System.out.println(toothpaste6.sensitivity);
		System.out.println(toothpaste6.ingredients);
		System.out.println(toothpaste6.price);
		
		System.out.println(toothpaste7.brand);
		System.out.println(toothpaste7.flavor);
		System.out.println(toothpaste7.size);
		System.out.println(toothpaste7.whitening);
		System.out.println(toothpaste7.anti_cavity);
		System.out.println(toothpaste7.sensitivity);
		System.out.println(toothpaste7.ingredients);
		System.out.println(toothpaste7.price);
		
		System.out.println(toothpaste8.brand);
		System.out.println(toothpaste8.flavor);
		System.out.println(toothpaste8.size);
		System.out.println(toothpaste8.whitening);
		System.out.println(toothpaste8.anti_cavity);
		System.out.println(toothpaste8.sensitivity);
		System.out.println(toothpaste8.ingredients);
		System.out.println(toothpaste8.price);
	}
}
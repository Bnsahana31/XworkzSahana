class Stove
{
	String brand;
	String fuel_type;
	int burner_count;
	double oven_capacity;
	String color;
	String control_type;
	boolean self_cleaning;
	double price;
	
	Stove(String brand,String fuel_type,int burner_count,double oven_capacity,String color,String control_type,boolean self_cleaning,double price)
	{
		this.brand = brand;
        this.fuel_type = fuel_type;
        this.burner_count = burner_count;
        this.oven_capacity = oven_capacity;
        this.color = color;
        this.control_type = control_type;
        this.self_cleaning = self_cleaning;
        this.price = price;
	}
}
class StoveRunner
{
	public static void main(String[]args)
	{
		System.out.println("main running");
		Stove stove1 =new Stove("Samsung", "Electric", 4, 5.8, "Stainless Steel", "Digital", true, 899.99);
		Stove stove2 =new Stove("Whirlpool", "Gas", 5, 6.0, "Black", "Knobs", false, 799.99);
 		Stove stove3 =new Stove("LG", "Electric", 6, 5.4, "White", "Touch", true, 999.99);
		Stove stove4 =new Stove("Frigidaire", "Gas", 4, 5.0, "Silver", "Digital", false, 749.99);
		Stove stove5 =new Stove("GE", "Electric", 4, 6.3, "Black Stainless Steel", "Knobs", true, 1099.99);
		Stove stove6 =new Stove("KitchenAid", "Gas", 6, 5.8, "Stainless Steel", "Touch", false, 1299.99);
		Stove stove7 =new Stove("Bosch", "Electric", 5, 4.8, "Black", "Digital", true, 899.99);
		Stove stove8 =new Stove("Maytag", "Gas", 4, 6.4, "White", "Knobs", false, 799.99);
		
		
		System.out.println(stove1.brand);
		System.out.println(stove1.fuel_type);
		System.out.println(stove1.burner_count);
		System.out.println(stove1.oven_capacity);
		System.out.println(stove1.color);
		System.out.println(stove1.control_type);
		System.out.println(stove1.self_cleaning);
		System.out.println(stove1.price);

		System.out.println(stove2.brand);
		System.out.println(stove2.fuel_type);
		System.out.println(stove2.burner_count);
		System.out.println(stove2.oven_capacity);
		System.out.println(stove2.color);
		System.out.println(stove2.control_type);
		System.out.println(stove2.self_cleaning);
		System.out.println(stove2.price);		
		
		System.out.println(stove3.brand);
		System.out.println(stove3.fuel_type);
		System.out.println(stove3.burner_count);
		System.out.println(stove3.oven_capacity);
		System.out.println(stove3.color);
		System.out.println(stove3.control_type);
		System.out.println(stove3.self_cleaning);
		System.out.println(stove3.price);

		System.out.println(stove4.brand);
		System.out.println(stove4.fuel_type);
		System.out.println(stove4.burner_count);
		System.out.println(stove4.oven_capacity);
		System.out.println(stove4.color);
		System.out.println(stove4.control_type);
		System.out.println(stove4.self_cleaning);
		System.out.println(stove4.price);
		
		System.out.println(stove5.brand);
		System.out.println(stove5.fuel_type);
		System.out.println(stove5.burner_count);
		System.out.println(stove5.oven_capacity);
		System.out.println(stove5.color);
		System.out.println(stove5.control_type);
		System.out.println(stove5.self_cleaning);
		System.out.println(stove5.price);
		
		System.out.println(stove6.brand);
		System.out.println(stove6.fuel_type);
		System.out.println(stove6.burner_count);
		System.out.println(stove6.oven_capacity);
		System.out.println(stove6.color);
		System.out.println(stove6.control_type);
		System.out.println(stove6.self_cleaning);
		System.out.println(stove6.price);
		
		System.out.println(stove7.brand);
		System.out.println(stove7.fuel_type);
		System.out.println(stove7.burner_count);
		System.out.println(stove7.oven_capacity);
		System.out.println(stove7.color);
		System.out.println(stove7.control_type);
		System.out.println(stove7.self_cleaning);
		System.out.println(stove7.price);
		
		System.out.println(stove8.brand);
		System.out.println(stove8.fuel_type);
		System.out.println(stove8.burner_count);
		System.out.println(stove8.oven_capacity);
		System.out.println(stove8.color);
		System.out.println(stove8.control_type);
		System.out.println(stove8.self_cleaning);
		System.out.println(stove8.price);
	}
}
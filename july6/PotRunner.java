class Pot
{
	String name;
	String color;
	String material;
	String shape; 
	int weight; 
	int width; 
	int height;
	double price;	
	
	Pot(String name,String color,String material,String shape,int weight,int width,int height,double price)
	{
		this.name=name;
		this.color=color;
		this.material=material;
		this.shape=shape;
		this.weight=weight;
		this.width=width;
		this.height=height;
		this.price=price;
		
	}
}
class PotRunner
{
	public static void main(String[]args)
	{
		System.out.println("");
		Pot pot1=new Pot("Terra Pottery","blue","sand","round",3,6,80,40);
		Pot pot2=new Pot("Garden","green","sand","ovel",5,4,90,50);
		Pot pot3=new Pot("Clay ","pink","sand","squre",2,6,70,60);
		Pot pot4=new Pot("Floral","black","sand","round",6,4,40,40);
		Pot pot5=new Pot("Organic","red","sand","ovel",7,6,80,70);
		Pot pot6=new Pot("Potpourri","white","sand","squre",8,4,80,90);
		Pot pot7=new Pot("Earthly","yellow","sand","modern",9,6,80,90);
		Pot pot8=new Pot("Herb", "pink","sand","modern",1,4,80,40);
		
		
		System.out.println(pot1.name);
		System.out.println(pot1.color);
		System.out.println(pot1.material);
		System.out.println(pot1.shape);
		System.out.println(pot1.weight);
		System.out.println(pot1.width);
		System.out.println(pot1.height);
		System.out.println(pot1.price);

		System.out.println(pot2.name);
		System.out.println(pot2.color);
		System.out.println(pot2.material);
		System.out.println(pot2.shape);
		System.out.println(pot2.weight);
		System.out.println(pot2.width);
		System.out.println(pot2.height);
		System.out.println(pot2.price);
		
		System.out.println(pot3.name);
		System.out.println(pot3.color);
		System.out.println(pot3.material);
		System.out.println(pot3.shape);
		System.out.println(pot3.weight);
		System.out.println(pot3.width);
		System.out.println(pot3.height);
		System.out.println(pot3.price);
		
		System.out.println(pot4.name);
		System.out.println(pot4.color);
		System.out.println(pot4.material);
		System.out.println(pot4.shape);
		System.out.println(pot4.weight);
		System.out.println(pot4.width);
		System.out.println(pot4.height);
		System.out.println(pot4.price);
		
		System.out.println(pot5.name);
		System.out.println(pot5.color);
		System.out.println(pot5.material);
		System.out.println(pot5.shape);
		System.out.println(pot5.weight);
		System.out.println(pot5.width);
		System.out.println(pot5.height);
		System.out.println(pot5.price);
		
		System.out.println(pot6.name);
		System.out.println(pot6.color);
		System.out.println(pot6.material);
		System.out.println(pot6.shape);
		System.out.println(pot6.weight);
		System.out.println(pot6.width);
		System.out.println(pot6.height);
		System.out.println(pot6.price);
		
		System.out.println(pot7.name);
		System.out.println(pot7.color);
		System.out.println(pot7.material);
		System.out.println(pot7.shape);
		System.out.println(pot7.weight);
		System.out.println(pot7.width);
		System.out.println(pot7.height);
		System.out.println(pot7.price);
		
		System.out.println(pot8.name);
		System.out.println(pot8.color);
		System.out.println(pot8.material);
		System.out.println(pot8.shape);
		System.out.println(pot8.weight);
		System.out.println(pot8.width);
		System.out.println(pot8.height);
		System.out.println(pot8.price);
	}
}

class Scissor {

String brand;
String colour;
String type;
String usage;
char size;
double price;
String material;


Scissor()
{
System.out.println("running no arfuments");
}

Scissor(String brand){
	System.out.println("running one arfuments");
	this.brand=brand;
}

Scissor(String brand,String colour){
	System.out.println("running 2 arfuments");
	this.brand=brand;
	this.colour=colour;
}

Scissor(String brand,String colour,String type){
	System.out.println("running 3 arfuments");
	this.brand=brand;
	this.colour=colour;
	this.type=type;
}

Scissor(String brand,String colour,String type,String usage){
	System.out.println("running 4 arfuments");
	this.brand=brand;
	this.colour=colour;
	this.type=type;
	this.usage=usage;
}

Scissor(String brand,String colour,String type,String usage,char size){
	System.out.println("running 5 arfuments");
	this.brand=brand;
	this.colour=colour;
	this.type=type;
	this.usage=usage;
	this.size=size;
}

Scissor(String brand,String colour,String type,String usage,char size,double price){
	System.out.println("running 6 arfuments");
	this.brand=brand;
	this.colour=colour;
	this.type=type;
	this.usage=usage;
	this.size=size;
	this.price=price;
}
}


class ScissorRun {
	public static void main(String[] args){
		Scissor ref=new Scissor();
		
		Scissor ref1=new Scissor("brand1");
		System.out.println(ref1.brand);
		
		Scissor ref2=new Scissor("brand1","black");
		System.out.println(ref2.brand);
		System.out.println(ref2.colour);
		
		Scissor ref3=new Scissor("brand1","black","dailyUse");
		System.out.println(ref3.brand);
		System.out.println(ref3.colour);
		System.out.println(ref3.type);
		
		Scissor ref4=new Scissor("brand1","black","dailyUse","helpful");
		System.out.println(ref4.brand);
		System.out.println(ref4.colour);
		System.out.println(ref4.type);
		System.out.println(ref4.usage);
		
		
		Scissor ref5=new Scissor("brand1","black","dailyUse","helpful",'Z');
		System.out.println(ref5.brand);
		System.out.println(ref5.colour);
		System.out.println(ref5.type);
		System.out.println(ref5.usage);
		System.out.println(ref5.size);
		
		Scissor ref6=new Scissor("brand1","black","dailyUse","helpful",'Z',30.9);
		System.out.println(ref6.brand);
		System.out.println(ref6.colour);
		System.out.println(ref6.type);
		System.out.println(ref6.usage);
		System.out.println(ref6.size);
		
		
	}
}
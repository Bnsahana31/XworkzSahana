class Oil {

String name;
double price;
int quantity;
double density ;
double viscosity;

Oil() 
{
	System.out.println("running with no argument ");

}

Oil(String name,double price,int  quantity,double density,double viscosity)
{
	this.name=name;
	this.price=price;
	this.quantity=quantity;
	this.density=density;
	this.viscosity=viscosity;

}

void oilInfo()         
{
	System.out.println(this.name);                      
	System.out.println(this.price);
	System.out.println(this.quantity);
	System.out.println(this.density);
	System.out.println(this.viscosity);

}

}

class OilRunner {
	public static void main(String[] args){

		Oil oil= new Oil();
		oil.oilInfo();

		Oil oil1=new Oil("Crude ",65.50,10000,0.85,10.5);
		oil1.oilInfo();

		System.out.println("updating data");
		 oil1.name="Olive ";
		  oil1.price=90.50;
		 oil1.quantity=250;
		 oil1.density=1.5;
		  oil1.viscosity=8.8;

		 oil1.oilInfo();

	}
}
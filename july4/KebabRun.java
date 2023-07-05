class Kebab {
String name;
double price;
String hotelName;
int noOfPieces;
boolean takeAway;


Kebab(){
	System.out.println("running no argument");
}

Kebab(String name,double price){
	System.out.println("running with 2 arguments");
	this.name=name;
	this.price=price;
}

Kebab(String name,double price,String hotelName){
	System.out.println("running with 3 arguments");
	this.name=name;
	this.price=price;
	this.hotelName=hotelName;

}

Kebab(String name,double price,String hotelName,int noOfPieces){
	System.out.println("running with 4 arguments");
	this.name=name;
	this.price=price;
	this.hotelName=hotelName;
	this.noOfPieces=noOfPieces;
}

Kebab(String name,double price,String hotelName,int noOfPieces,boolean takeAway){
	System.out.println("running with 4 arguments");
	this.name=name;
	this.price=price;
	this.hotelName=hotelName;
	this.noOfPieces=noOfPieces;
	this.takeAway=takeAway;
}
}

class KebabRun {
	public static void main(String[] args){
		new Kebab();
		
		Kebab ref=new Kebab("chicken kabab",205.9);
		System.out.println("chickname 2 argument:"+ref.name);
		System.out.println("price 2 argument:"+ref.price);
		
		Kebab ref2=new Kebab("chicken kabab",209.9,"ajji mane");
		System.out.println("chickname 3 argument:"+ref2.name);
		System.out.println("price 3 argument:"+ref2.price);
	    System.out.println("price 3 argument:"+ref2.hotelName);
		
		Kebab ref3=new Kebab("chicken kabab",209.9,"ajji mane",10);
		System.out.println("chickname 4 argument:"+ref2.name);
		System.out.println("price 4 argument:"+ref3.price);
	    System.out.println("price 4 argument:"+ref3.hotelName);
		System.out.println("price 4 argument:"+ref3.noOfPieces);
		
		Kebab ref4=new Kebab("chicken kabab",209.9,"ajji mane",10);
		System.out.println("chickname 4 argument:"+ref4.name);
		System.out.println("price 4 argument:"+ref4.price);
	    System.out.println("price 4 argument:"+ref4.hotelName);
		System.out.println("price 4 argument:"+ref4.noOfPieces);
		
		Kebab ref5=new Kebab("chicken kabab",209.9,"ajji mane",10, true);
		System.out.println("chickname 5 argument:"+ref5.name);
		System.out.println("price 5 argument:"+ref5.price);
	    System.out.println("price 5 argument:"+ref5.hotelName);
		System.out.println("price 5 argument:"+ref5.noOfPieces);
		System.out.println("price 5 argument:"+ref5.takeAway);
		
	}
}
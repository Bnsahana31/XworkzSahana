class Fish {
String name;
String type;
int price;
String location;

Fish() {
System.out.println("Running fish");
}

Fish(String name) {
this.name=name;
}

Fish(String name, String type) {
this. name=name;
this.type=type;
}

Fish(String name, String type, int price){
	this.name=name;
	this.type=type;
	this.price=price;
System.out.println(name);
}
}

class FishRun {
	public static void main(String[] args){
		
		Fish ref=new Fish();
		Fish ref1=new Fish("star fish");
		System.out.println("fish name is:" + ref1.name);
		Fish ref2=new Fish("star fish","big");
		System.out.println(ref2.name);
		System.out.println(ref2.type);
		Fish ref3=new Fish("starfish","big",390);
		System.out.println(ref3.name);
		System.out.println(ref3.type);
		System.out.println(ref3.name);
		
		
		
	
	}
}
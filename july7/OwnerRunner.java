class Owner {
	String name;
	int age;
	String place;
	String shop;
	String location;
	
	Owner(String name,int age,String place,String shop,String location)
	{
	System.out.println("running String int String String String arg in Owner");
	this.name=name;
	this.age=age;
	this.place=place;
	this.shop=shop;
	this.location=location;
	}

	void ownerstatus (){
	System.out.println(this.name);
	System.out.println(this.age);
	System.out.println(this.place);
	System.out.println(this.shop);
	System.out.println(this.location);
}
}

class OwnerRunner {
public static void main(String[] args){

Owner ref=new Owner("sow",21,"birur","cocopeat","devalapura");
ref.ownerstatus();

ref.name="sahana";
ref.age=22;
ref.place="hassan";
ref.shop="software";
ref.location="dghalli";
ref.ownerstatus();

}
}



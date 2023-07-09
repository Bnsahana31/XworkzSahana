class FireExstinguisher {
	double capacity;
	String type;
	String manufacturer;
	double pressure;
	String city;

	FireExstinguisher()
	{
		System.out.println("running with no argument ");
	}

	FireExstinguisher(double capacity,String type,String manufacturer,double pressure,String city)
	{
		this.capacity=capacity;
	    this.type=type;
		this.manufacturer=manufacturer;
		this.pressure=pressure;
		this.city=city;
	}

	void fireInfo()
	{
		System.out.println(this.capacity);
		System.out.println(this.type);
		System.out.println(this.manufacturer);
		System.out.println(this.pressure);
		System.out.println(this.city);
	}
}
class FireExRunner{
	public static void main(String[] args) {
		FireExstinguisher ref=new FireExstinguisher();
		ref.fireInfo();
		
		FireExstinguisher ref2 =new FireExstinguisher(5.5,"fire","ram",7.1,"hassan");
		System.out.println("running FireExstinguisherRun");
		ref2.fireInfo();

		ref.capacity=6.4;
		ref.type="current";
		ref.manufacturer="ravi";
		ref.pressure=20.9;
		ref.city="bng";
		ref2.fireInfo();
	}

}
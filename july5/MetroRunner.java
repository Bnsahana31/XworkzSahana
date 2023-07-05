class Metro 
{
	String line;
	double distance;
	String start;
	String destination;
	int capacity;
	
	Metro(String line,double distance)
	{
		System.out.println("String line,double distance,String start,String destination,int capacity");
		this.line=line;
		this.distance=distance;
	}
	Metro(String line,double distance,String start)
	{
		this(line,distance);
		this.start=start;
	}
	Metro(String line,double distance,String start,String destination)
	{
		this(line,distance,start);//chaining//
		this.destination=destination;
	}
	Metro(String line,double distance,String start,String destination,int capacity)
	{
		this(line,distance,start,destination);
		this.capacity=capacity;
	}
}
	
	
	
class MetroRunner
{
	public static void main(String[]args)
	{
		System.out.println("main running");
		
		Metro metro =new Metro("blue",23.8);
		System.out.println("metro is in " + metro.line);
		System.out.println("the distanceis " + metro.distance);
		
		Metro metro1 =new Metro("blue",23.8,"Yeshwanthpur");
		System.out.println("metro is in " + metro1.line );
		System.out.println("the distanceis " + metro1.distance );
		System.out.println("the start place is " + metro1.start);
		
		
		Metro metro2 =new Metro("blue",23.8,"Yeshwanthpur","btm layout");
		System.out.println("metro is in " + metro2.line);
		System.out.println("the distanceis " + metro2.distance);
		System.out.println("the start place is " + metro2.start);
		System.out.println("the destination is " + metro2.destination);
		
		Metro metro3 =new Metro("blue",23.8,"Yeshwanthpur","btm layout",250);
		System.out.println("metro is in " + metro3.line );
		System.out.println("the distanceis " + metro3.distance);
		System.out.println("the start place is " + metro3.start);
		System.out.println("the destination is " + metro3.destination);
		System.out.println("the capacityof metrois " + metro3.capacity);
	}
}

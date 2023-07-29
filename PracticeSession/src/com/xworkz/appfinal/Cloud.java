package com.xworkz.appfinal;

public class Cloud {
	    private  String type;
	    private  String provider;
	    private  String location;

	    public Cloud(String type, String provider, String location) {
	        this.type = type;
	        this.provider = provider;
	        this.location = location;
	    }

	    // Final method to display information about the cloud Final method cannot be Override
	    public final void displayCloudInfo() {
	        System.out.println("Type: " + type);
	        System.out.println("Provider: " + provider);
	        System.out.println("Location: " + location);
	    }

	    public static void main(String[] args) {
	       
	        Cloud myCloud = new Cloud("Public", "AWS", "US-East");
	        myCloud.displayCloudInfo();
	    }
	

}

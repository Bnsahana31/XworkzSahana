class Infosys 
{
	String founderName;
	String founderWifeName;
	int  founded;
	int totalEmploye;
	
	Infosys(String founderName)
	{
		System.out.println("the info of Infosys");
		this.founderName=founderName;
	}
	Infosys(String founderName,String founderWifeName)
	{
		this(founderName);
		this.founderWifeName=founderWifeName;
	}
	Infosys(String founderName,String founderWifeName,int founded)
	{
		this(founderName,founderWifeName);//chaining//
		this.founded=founded;
	}
	Infosys(String founderName,String founderWifeName,int founded,int totalEmploye)
	{
		this(founderName,founderWifeName,founded);
		this.totalEmploye=totalEmploye;
	}
}
	
	
	
class InfosysRunner
{
	public static void main(String[]args)
	{
		System.out.println("main running");
		
		Infosys infosys =new Infosys("N. R. Narayana Murthy");
		System.out.println("founder of infosys is " + infosys.founderName);
		
		Infosys infosys1 =new Infosys("N. R. Narayana Murthy","Sudha Murthy");
		System.out.println("founder of infosys is " + infosys1.founderName);
		System.out.println("Wife of " + infosys1.founderName + " is " +  infosys1.founderWifeName );
		
		
		Infosys infosys2 =new Infosys("N. R. Narayana Murthy","Sudha Murthy",1981);
		System.out.println("founder of infosys is " + infosys2.founderName);
		System.out.println("Wife of " + infosys2.founderName + " is " +  infosys2.founderWifeName );
		System.out.println("It was founded in the year " +infosys2.founded);
		
		
		Infosys infosys3 =new Infosys("N. R. Narayana Murthy","Sudha Murthy",1981,314015);
		System.out.println("founder of infosys is " + infosys3.founderName);
		System.out.println("Wife of " + infosys3.founderName + " is " +  infosys3.founderWifeName );
		System.out.println("It was founded in the year " +infosys3.founded);
		System.out.println("The total employes in infosysis  " +infosys3.totalEmploye);
		
		
		
	}
}

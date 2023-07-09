class Worker {
 String name;
 int age;
 int id;
 String company;

 Worker(String name,int age,int height,String company)
 {
	 this.name=name;
	 this.age=age;
	 this.id=id;
	 this.company=company;
 }

 void work()
 {
	 System.out.println(name);
	 System.out.println(age);
	 System.out.println(id);
	 System.out.println(company);

 }
}
 class WorkerRun
 {
	 public static void main(String[] args){
	 Worker ref=new Worker("sow",22,52,"google");
	 ref.work();

	 ref.name="nethra";
	 ref.age=22;
	 ref.id=75;
	 ref.company="twitter";
	 ref.work();

 }
 }
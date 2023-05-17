public class FrndsList{
	String name,designation;
	int age,salary;
	
	FrndsList(String name,int age,int salary,String designation){
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.designation=designation;
	}
	
	public void display(){
		System.out.println(name+" :Name "+age+" :Age "+salary+" :salry "+designation+  "Designation");
	}
	
	public void raiseSalary(int amount){
		salary+=amount;
		System.out.println(salary);
	}

	public static void main(String[] args){
		FrndsList e1 = new FrndsList("Rakesh",20,60000,"Developer");
		FrndsList e2 = new FrndsList("SaiKarthik",20,60000,"Tester");
		FrndsList e3 = new FrndsList("Musli",20,60000,"Developer");
		FrndsList e4 = new FrndsList("Rakshitha",20,60000,"Tester");
		
		e1.display();
		e2.display();
		e3.display();
		e4.display();
		System.out.println("______________");
		System.out.println("salary after increment!");

		e1.raiseSalary(200001);
		e2.raiseSalary(200002);
		e3.raiseSalary(200003);
		e4.raiseSalary(200004);
		System.out.println("______________");

		e1.display();
		e2.display();
		e3.display();
		e4.display();
	}
}

/**C:\Users\raksh\Desktop>java FrndsList
Rakesh :Name 20 :Age 60000 :salry DeveloperDesignation
SaiKarthik :Name 20 :Age 60000 :salry TesterDesignation
Musli :Name 20 :Age 60000 :salry DeveloperDesignation
Rakshitha :Name 20 :Age 60000 :salry TesterDesignation
______________
260001
260002
260003
260004
______________
Rakesh :Name 20 :Age 260001 :salry DeveloperDesignation
SaiKarthik :Name 20 :Age 260002 :salry TesterDesignation
Musli :Name 20 :Age 260003 :salry DeveloperDesignation
Rakshitha :Name 20 :Age 260004 :salry TesterDesignation*/






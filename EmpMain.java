class Emp{
	int age,salary;
	String name,designation;
	Emp(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void display(){
		System.out.println(name+":name,"+age+":age,"+salary+":salary,"+designation+":designation");
		System.out.println("__________________________________________");

	}
	public void raiseSalary(){
		switch(designation){
			case "Tester":salary+=2000;
						break;
			case "Programmer":salary+=5000;
						break;
			case "Manager":salary+=10000;
						break;
		}
	}
}
class Tester extends Emp{
	Tester(String name,int age){
		super(name,age);
		salary=15000;
		designation="Tester";
	}
}
class Programmer extends Emp{


	Programmer(String name,int age){
		super(name,age);
		salary=30000;
		designation="Programmer";
	}
}
class Manager extends Emp{

	Manager(String name,int age){
		super(name,age);
		salary=90000;
		designation="Manager";
	}
}
public class EmpMain{
	public static void main(String[] args){
		Emp e1 = new Tester("Ravi",23);
		Emp e2 = new Programmer("Prashanth",25);
		Emp e3 = new Manager("Mamtha",26);
		e1.display();
		e2.display();
		e3.display();
		System.out.println("AFTER RAISING THE SALARIES");
		System.out.println("==================================");
		e1.raiseSalary();
		e2.raiseSalary();
		e3.raiseSalary();
		e1.display();
		e2.display();
		e3.display();
	}
}
/**
C:\Users\raksh\Desktop\TC-ClassWork\classWork>javac EmpMain.java

C:\Users\raksh\Desktop\TC-ClassWork\classWork>java EmpMain
Ravi:name,23:age,15000:salary,Tester:designation
__________________________________________
Prashanth:name,25:age,30000:salary,Programmer:designation
__________________________________________
Mamtha:name,26:age,90000:salary,Manager:designation
__________________________________________
AFTER RAISING THE SALARIES
==================================
Ravi:name,23:age,17000:salary,Tester:designation
__________________________________________
Prashanth:name,25:age,35000:salary,Programmer:designation
__________________________________________
Mamtha:name,26:age,100000:salary,Manager:designation
__________________________________________

C:\Users\raksh\Desktop\TC-ClassWork\classWork>*/




	

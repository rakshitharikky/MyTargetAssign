public class Canara{
	String name,accountNumber;
	long cash;
	Canara(String name,String accountNumber,long cash){
		this.name=name;
		this.accountNumber=accountNumber;
		this.cash=cash;
	}
	void display(){
		System.out.println(name+"   "+accountNumber+"    "+cash);
	}
	public void deposite(int amount){
		cash+=amount;
		System.out.println(cash);

		withDrawal(25000);
	}
	public void withDrawal(int amount){
		cash-=amount;
		System.out.println("after withdrawal");
		System.out.println(cash);
	}

	public static void main(String args[]){
		Canara obj1 = new Canara("Rakesh","2000xxxh2025",100000000000L);	
		Canara obj2 = new Canara("SaiKarthik","2000xxxh2024",100000000000L);	
		Canara obj3 = new Canara("Anusha","2000xxxh203",100000000000L);
		Canara obj4 = new Canara("Rakshitha","2000xxxh2029",100000000000L);
		obj1.display();
		obj2.display();
		obj3.display();
		obj4.display();
		System.out.println("After Deposition and WithDrawal");
		
		obj1.deposite(50000);
		obj2.deposite(600000);
		obj3.deposite(70000);
		obj4.deposite(80000);


	}
}
/**C:\Users\raksh\Desktop>java Canara
Rakesh   2000xxxh2025    100000000000
SaiKarthik   2000xxxh2024    100000000000
Anusha   2000xxxh203    100000000000
Rakshitha   2000xxxh2029    100000000000
After Deposition and WithDrawal
100000050000
After WithDrawal
100000025000
100000600000
After WithDrawal
100000575000
100000070000
After WithDrawal
100000045000
100000080000
After WithDrawal
100000055000*/


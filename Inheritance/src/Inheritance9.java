
class Company22{
	void display()
	{
		System.out.println("company display");
	}
}

class Emp extends Company22{
	void display()
	{
		System.out.println("emp display");
	}
	void callme() {
		display();
		super.display();
		System.out.println("emp callme");
	}
}


public class Inheritance9 {

	public static void main(String[] args) {

		Emp e = new Emp();
		e.display();
		e.callme();
		
		Company22 c = new Company22();
		c.display();
		
		Company22 c1 = new Emp();
		c1.display();
		//c1.callme();
		
	}

}

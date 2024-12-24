
class Sample1{
	int age = 25;
	void calling()
	{
		System.out.println("this is Sample1 calling");
	}
}

class Sample2{
	int empId = 123;
	void display()
	{
		System.out.println("this is Sample2 display");
	}
}


public class Example1 {

	int salary = 50000;

	public static void main(String[] args) {
		

		Sample1 s1 = new Sample1();
		System.out.println("sample 1 age =>"+s1.age);
		s1.calling();
		
		Sample2 s2 = new Sample2();
		System.out.println("sample2 empid = "+s2.empId);
		s2.display();
		
	}

}

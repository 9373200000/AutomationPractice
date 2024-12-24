
class Grandfather2
{
	public Grandfather2() {
		System.out.println("Grandfather constructor");
	}
	
	void myHome()
	{
		System.out.println("Grandfather home");
	}
}

class Father2 extends Grandfather2{
	public Father2(int num) {
		System.out.println("Father constructor");
	}
	
	void myCar()
	{
		System.out.println("Father car");
	}
}

class Child2 extends Father2
{
	Child2()
	{
		super(50);
		System.out.println("Child constructor");
	}
	
	void myBike()
	{
		System.out.println("Child bike");
	}
}

public class Example4 {

	public static void main(String[] args) {
		
		Child2 ch = new Child2();
		
	}

}

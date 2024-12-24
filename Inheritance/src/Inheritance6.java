
class Grandfather11{
	Grandfather11()
	{
		System.out.println("grandfather constructor");
	}
	
	void myHome()
	{
		System.out.println("grandfather myHome");
	}
}

class Father11 extends Grandfather11
{
	Father11()
	{
		System.out.println("father constructor");
	}
	void myCar()
	{
		System.out.println("father myCar");
	}
}
class Child11 extends Father11
{
	Child11()
	{
		System.out.println("child constructor");
	}
	void myBike()
	{
		System.out.println("child bike");
	}
}

public class Inheritance6 {

	public static void main(String[] args) {
		
		Child11 ch = new Child11();
		ch.myBike();
		ch.myCar();
		ch.myHome();
		
		Father11 f = new Father11();
		f.myCar();
		f.myHome();
		
		System.out.println("-------");
		
		Father11 f1 = new Child11();
		f1.myCar();
		f1.myHome();
		
		Grandfather11 gf11 = new Father11();
		gf11.myHome();
		
		Grandfather11 gf12 = new Child11();
		gf12.myHome();
		

	}

}

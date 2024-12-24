
//multiple inheritance---1 child many parents

class B2
{
	void msg()
	{
		System.out.println("B2 msg");
	}
}
class A2
{
	void msg()
	{
		System.out.println("A2 msg");
	}
}


public class Inheritance5 extends B2,A2{

	Inheritance5()
	{
		
	}
	
	public static void main(String[] args) {
		
		Inheritance5 i = new Inheritance5();
		i.msg();
		
	}

}

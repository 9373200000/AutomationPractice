
// Hierarchical inheritance

class vehicle{
	public void wheels()
	{
		System.out.println("i'm vehicle");
	}
}

class bike extends vehicle{
	void count1()
	{
		System.out.println("i'm bike");
	}
}
class car1 extends vehicle{
	void count2()
	{
		System.out.println("i'm car");
	}
}
class scooter extends vehicle{
	void count3()
	{
		System.out.println("i'm scooter");
	}
}

public class Inheritance4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		bike b = new bike();
		b.wheels();
		b.count1();
		
		car1 c = new car1();
		c.wheels();
		c.count2();
		
		scooter sc = new scooter();
		sc.wheels();
		sc.count3();
		
		
	}

}

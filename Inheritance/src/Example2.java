
class Grandfather{
	//default constructor
	//no default super class
	void myHome()
	{
		System.out.println("Grandfather Home");
	}
}

class Father extends Grandfather{
	//default constructor
	//default super()
	//myHome() method available
	
	void myCar()
	{
		System.out.println("father car");
	}
}

class Child extends Father
{
	//default constructor
	//default super()
	//myCar
	//myHome
	
	void myBike()
	{
		System.out.println("Child bike");
	}
}


public class Example2 {

	public static void main(String[] args) {
		
		Child ch = new Child();
		ch.myBike();
		ch.myCar();
		ch.myHome();
		System.out.println("________________");

		Father f = new Father();
		f.myCar();
		f.myHome();
		System.out.println("________________");

		Grandfather gf = new Grandfather();
		gf.myHome();
	}

}

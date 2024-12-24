

class GrandFather1{
	//constructor
	public GrandFather1() {
		System.out.println("Grandfather constructor");
	}
	
	void myHome(){
		System.out.println("Grandfather home");
	}
}

class Father1 extends GrandFather1{
	//default super()
	//constructor
	public Father1() {
		System.out.println("Father constructor");
	}
	
	void myCar()
	{
		System.out.println("Father car");
	}
}

class Child1 extends Father1
{
	//default super()
	//constructor
	public Child1() {
		System.out.println("Child constructor");
	}
	
	void myBike()
	{
		System.out.println("Child bike");
	}
}


public class Example3 {

	public static void main(String[] args) {
		
		Child1 ch = new Child1();
		

	}

}


class A1{
	//default constructor
	static int a = 10;
	int b = 20;
	double c = 13.24;
}

class B1 extends A1
{
	//default constructor
	//default super()
	
	static int x = 30;
	int b = 40;
	double z = 53.77;
}

class C1 extends B1
{
	static int p = 20;
	int q = 60;
	double r = 66.99;
}



public class Inheritance1 {

	public static void main(String[] args) {
		//Static member of class A1, B1, C1
		System.out.println("static members->"+A1.a+" "+B1.x+" "+C1.p);
		
		System.out.println("static members by inheritance->"+C1.p+" "+C1.x+" "+C1.a);
		
		C1 c = new C1();
		System.out.println("All static and non static variables->"+c.p+" "+c.q+" "+c.r);
		System.out.println("All static and non static variables->"+c.x+" "+c.b+" "+c.z);
		System.out.println("All static and non static variables->"+c.a+" "+c.b+" "+c.c);//c.b will be B1's b Not A1 b...

		B1 b = new B1();
		System.out.println("All static and non static variables->"+b.a+" "+b.b+" "+b.c);
		System.out.println("All static and non static variables->"+b.x+" "+b.b+" "+b.z);
		//System.out.println("All static and non static variables->"+b.p+" "+b.q+" "+b.r); can not access
	}

}

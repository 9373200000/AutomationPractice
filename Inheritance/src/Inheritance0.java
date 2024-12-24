
class A
{
	static int a = 10;
	int b = 20;
	double c = 13.24;
}
class B{
	static int x = 30;
	int b = 40;
	double z = 53.77;
}
class C{
	static int p = 20;
	int q = 60;
	double r = 66.99;
}

public class Inheritance0 {

	public static void main(String[] args) {
		
		System.out.println("static class A->"+A.a);
		System.out.println("static class B->"+B.x);
		System.out.println("static class C->"+C.p);
		
		A a = new A();
		System.out.println("non static class A->"+a.b+" "+a.c);
		
		B b = new B();
		System.out.println("non static class B->"+b.b+" "+b.z);
		
		C c = new C();
		System.out.println("non static class C->"+c.q+" "+c.r);
	}
	

}

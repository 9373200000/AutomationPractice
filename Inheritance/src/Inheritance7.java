
class fruits1
{
	int fruitAge;
	fruits1()
	{
		System.out.println("fruit constructor");
		fruitAge = 7;
	}
	void taste()
	{
		System.out.println("fruit taste");
	}
}

class orange1 extends fruits1
{
	int fruitAge;
	
	orange1(){
		System.out.println("orange constructor");
		fruitAge = 5;
	}
	void taste()
	{
		System.out.println("orange taste");
	}
	void shape()
	{
		fruits1 f = new fruits1();
		System.out.println("--"+fruitAge);
		System.out.println("--"+f.fruitAge);
		System.out.println("--"+super.fruitAge);
	}
}


public class Inheritance7 {

	public static void main(String[] args) {
		orange1 o = new orange1();
		o.shape();
		System.out.println(""+o.fruitAge);
	}

}

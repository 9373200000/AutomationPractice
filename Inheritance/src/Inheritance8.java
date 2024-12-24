
class fruitA{
	int fruitAge;
	fruitA(){
		System.out.println("fruitA constructor");
		fruitAge = 7;
	}
	void taste()
	{
		System.out.println("fruit taste");
	}
}

class mango extends fruitA{
	int fruitAge;
	mango(){
		System.out.println("mango constructor");
		fruitAge = 7;
	}
	@Override
	void taste()
	{
		System.out.println("mango taste");
	}
	void shape()
	{
		System.out.println("mango sleep");
	}
}



public class Inheritance8 {

	public static void main(String[] args) {

		mango m = new mango();
		m.taste();
		m.shape();
		
	}

}

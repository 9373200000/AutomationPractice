
// single inheritance
class fruit{
	fruit()
	{
		System.out.println("fruit constructor");
	}
	public void taste()
	{
		System.out.println("fruit taste");
	}
}

class apple extends fruit{
	apple()
	{
		//super() bydefault--> so go to fruit constructor 1st
		System.out.println("apple constructor");
	}
	void shape() {
		System.out.println("apple shape");
	}
}
 


public class Inheritance2 {

	public static void main(String[] args) {
		
		apple a = new apple();
		a.shape();
		a.taste();
	}

}

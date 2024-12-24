
//multilevel inheritance

class fourWheeler{
	//default constructor
	void wheels()
	{
		System.out.println("four wheeler wheels");
	}
}

class car extends fourWheeler{
	//default constructor and super()
	void type()
	{
		System.out.println("Im car");
	}
}

class maruti extends car{
	//default constructor and super()
	void company()
	{
		System.out.println("maruti");
	}
}

public class Inheritance3 {

	public static void main(String[] args) {
		
		maruti m = new maruti();
		m.wheels();
		m.type();
		m.company();
	}

}

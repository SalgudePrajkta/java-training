package jungle.cave;

class cat{
	
	
	
	void meow() {
		Tiger tiger=new Tiger();
		tiger.roar();       //default method available only in that package
		tiger.walk();       //public method is available everywhere
		tiger.hunt();       //protected only available in derived class and in same package non child can access due to trust factor
		//tiger.eat();      //private hence not available outside class
	}
}

class BengolTiger extends Tiger {
	void sleep() {
		Tiger tiger=new Tiger();
		tiger.roar();       //default method available only in that package
		tiger.walk();       //public method is available everywhere
		tiger.hunt();       //protected only available in derived class and in same package non child can access due to trust factor
		//tiger.eat();      //private hence not available outside class
	
		super.roar();
		super.walk();
		super.hunt();
		//super.eat();
		
		
	}
}

public class Tiger {
	public Tiger() {
		
	}
	void roar() {
		System.out.println("Tiger is roaring");
	}
	
	public void walk() {
		System.out.println("Tiger is walking");
	}
	
	protected void hunt() {
		System.out.println("Tiger is hunting");
	}
	
	private void eat() {
		System.out.println("Tiger is eating");
	}
}

package jungle.tree;

import jungle.cave.Tiger;

public class WhiteTiger extends Tiger{
	void roaming() {
		Tiger tiger=new Tiger();
		//tiger.roar();     //default method available only in that package
		tiger.walk();       //public method is available everywhere
		//tiger.hunt();     //protected only available in derived class  and in same package non child can access due to trust factor
		//tiger.eat();      //private hence not available outside class
	}
	
	void roaming(Tiger tiger) {
		//tiger.roar();     //default method available only in that package
		tiger.walk();       //public method is available everywhere
		//tiger.hunt();     //protected only available in derived class  and in same package non child can access due to trust factor
		//tiger.eat();      //private hence not available outside class
		
		//super.roar();
		super.walk();
		super.hunt();
		//super.eat();
		
		//roar();
		walk();
		hunt();
		//eat();
	}
	

}

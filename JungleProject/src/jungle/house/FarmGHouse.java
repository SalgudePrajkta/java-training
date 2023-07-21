package jungle.house;

import jungle.cave.Tiger;

public class FarmGHouse {
	public static void main(String[] args) {
		Tiger tiger=new Tiger();
		//tiger.roar();     //default method available only in that package
		tiger.walk();       //public method is available everywhere
		//tiger.hunt();     //protected only available in derived class  and in same package non child can access due to trust factor
		//tiger.eat();      //private hence not available outside class
	}
}

package innerclasses;

class Outer1{
// Method inside outer class
	void outerMethods()
	{
		System.out.println("this is inside outerMethod");
		// It is local to outerMethod()
		class Inner1 {
			// Method defined inside inner class
			void innerMethod()
			{
				System.out.println("this inside innerMethod");
			}
		}
		Inner1 y = new Inner1();
		// Calling over method defined inside it
		y.innerMethod();
	}
}

class methodlocalinnerclass {
	public static void main(String[] args)
	{
// Creating object of outer class inside main()
		Outer1 x = new Outer1();
		x.outerMethods();
	}
}





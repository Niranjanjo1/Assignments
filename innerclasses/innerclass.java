package innerclasses;

class Outer {
	//  inner class
	class Inner {
		// show() method of inner class
		public void show()
		{
		System.out.println("Im in a nested class method");
		}
	}

	
}
class innerclass {
	public static void main(String[] args)
	{
// how inner class object is created inside main()
		Outer.Inner in = new Outer().new Inner();
// Calling show() method over above object created
		in.show();
	}
}




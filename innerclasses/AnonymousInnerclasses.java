package innerclasses;

// Anonymous Inner classes
class Demo {
	void show()
	{
		
		System.out.println("this is in method of super class");
	}
}

class AnonymousInnerclasses {
	static Demo d = new Demo() {
		void show()
		{
		super.show();
			System.out.println("im in AnonymousInnerclasses class");
		}
	};
public static void main(String[] args)
	{
		
		d.show();
	}
}



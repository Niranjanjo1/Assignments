package constructor;

public class Student {
	
		
		
		int id;
		String name;
		int age;
		String collage;

		Student(int id,String name,int age,String collage)
		{
		this.id=id;
		this.name=name;
		this.age=age;
		this.collage=collage;
		
		}

		void display() {
		System.out.println("ID :"+id+"\nName :"+name+"\nAge :"+age+"\ncollage :"+collage);
		System.out.println("----------------------");
		}
	}



package constructor;

//default constructor
class studentInformation{
	int id;
	String name;
	char gender;

void display() {
	System.out.println(id+" "+name+" "+gender);
	}
}

public class constructorStudent {

public static void main(String[] args) {

	studentInformation emp1=new studentInformation();
	studentInformation emp2=new studentInformation();

	emp1.display();
	emp2.display();
	}
}

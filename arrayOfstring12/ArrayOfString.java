package arrayOfstring12;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayOfString {
	public static void main(String[] args) {
		
	
	Scanner scn=new Scanner(System.in);
	System.out.println("enter string values");
	ArrayList <String> a=new ArrayList<String>();
	String Firstname=scn.nextLine();
	String Secondname=scn.nextLine();
	String thirdname=scn.nextLine();
	a.add(Firstname);
	a.add(Secondname);
	a.add(thirdname);
    System.out.println("enter any one string from above strings");
    String names=scn.nextLine();
    if(Firstname.contains(names) || Secondname.contains(names) || thirdname.contains(names)) {
    	System.out.println(names);
    	System.out.println("it is valid");
    }
    else {
    	System.out.println("invalid");
    }

}
}

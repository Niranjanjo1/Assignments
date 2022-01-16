package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist 
{
	public static void main(String[] args) {
		
	
	System.out.println("\n");
    System.out.println("collections LinkedList");
    LinkedList<String> cars=new LinkedList<String>();  
    cars.add("Audi");  
    cars.add("BMW"); 
    cars.add("tasla");
    Iterator<String> itr=cars.iterator();  
    while(itr.hasNext()){  
     System.out.println(itr.next());

    }

    }
	}

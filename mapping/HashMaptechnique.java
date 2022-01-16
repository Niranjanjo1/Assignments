package mapping;
import java.util.HashMap;

public class HashMaptechnique{

	public static void main(String[] args) {
	
	HashMap<Integer,String> h=new HashMap<Integer, String>();
	h.put(1, "Niranjan j");
	h.put(2, "priyanka");
	h.put(3, "sushma");
	h.put(4, "harshi");
	h.put(5, "sangana");
	h.put(7, "rocky");
	h.put(6, "armaan");
	h.put(8, "rajesh");
	h.put(2,"amrita");
	h.put(9,"ravi");
	h.put(null, "magha");
	h.put(2, "sunju");
	
	
	System.out.println("Size of map "+h.size());
	for(Integer key:h.keySet()){
		String name=h.get(key);
		System.out.println(key+ " "+name);
	}
	h.remove(2);
	System.out.println("After removing second");
	for(Integer key:h.keySet()){
		String i=h.get(key);
		System.out.println(key+ " "+i);
	}
	System.out.println();
	System.out.println("is the map contains anything " +h.isEmpty());
	System.out.println("is the map contains 2 "+h.containsKey(2));
	System.out.println("is the map contains shreya "+h.containsValue("Shreya"));
	
	

	}

}
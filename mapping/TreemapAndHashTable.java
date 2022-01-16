package mapping;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;





public class TreemapAndHashTable {
	public static void main(String[] args) {
		
		
		
      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(1,"vishu");  
	      ht.put(2,"ram");  
	      ht.put(3,"mickey");  
	      ht.put(4,"sam");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }

		
	
    TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
    map.put(4,"niranjan");    
    map.put(5,"priyanka");    
    map.put(6,"sushma");       
    
    System.out.println("\nThe elements of TreeMap are ");  
    for(Entry<Integer, String> l:map.entrySet()){    
     System.out.println(l.getKey()+" "+l.getValue());    
    }    
    
 }  


}

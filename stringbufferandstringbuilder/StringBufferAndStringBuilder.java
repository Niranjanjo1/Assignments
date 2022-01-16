package stringbufferandstringbuilder;

public class StringBufferAndStringBuilder {

	
	
	public static void main(String[] args) {
		

//Conversion of Strings to StringBuffer and StringBuilder

	String str = "niranjan"; 

	// conversion from String object to StringBuffer 
	StringBuffer sbr = new StringBuffer(str); 
	sbr.reverse(); 
	System.out.println("String to StringBuffer");
	System.out.println(sbr); 
	  
	// conversion from String object to StringBuilder 
	StringBuilder sbl = new StringBuilder(str); 
	sbl.append("priyanka"); 
	System.out.println("String to StringBuilder");
	System.out.println(sbl);              		
	}
	}


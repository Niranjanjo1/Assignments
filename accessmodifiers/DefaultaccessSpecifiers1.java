package com.accessmodifiers;
// Class is having Default access modifier the scope is within class and within package 
class DefaultAccessSpecifier
{ 
	int n=12;
void display() 
   { 
	
       System.out.println("this is  defalut access specifier class"); 
   } 
} 

public class DefaultaccessSpecifiers1 {

	public static void main(String[] args) {
		//default
		System.out.println("Default Access Specifier");
		DefaultAccessSpecifier obj = new DefaultAccessSpecifier(); 		
		System.out.println("this variable value is from default access specifier class :"+obj.n);
      obj.display(); 

	}
}

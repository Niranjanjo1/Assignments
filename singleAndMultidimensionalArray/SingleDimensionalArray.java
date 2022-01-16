package singleAndMultidimensionalArray;


import java.util.Scanner;

public class SingleDimensionalArray{
	int marks[]=new int[5];
	
	void getInfo(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks for 5 subjects");
		for(int i=0;i<=marks.length-1;i++){
			marks[i]=sc.nextInt();
		}
	}
		int calcTotal(){
			int sum=0;
			for(int i=0;i<marks.length;i++){
				sum=sum+marks[i];
			}
		return sum;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleDimensionalArray obj=new SingleDimensionalArray();
			obj.getInfo();
			System.out.println("Total="+obj.calcTotal());
	}

}
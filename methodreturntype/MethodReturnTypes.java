package methodreturntype;
public class MethodReturnTypes {
void display() {
	System.out.println("Hello");
}
int display1(int a,int b) {
	int sum=a+b;
	return sum;
}
double display2(double a,double b) {
	double sum=a+b;
	return sum;
}
String display3(String str) {
	
	return str;
}
public static void main(String[] args) {
	MethodReturnTypes rt=new MethodReturnTypes();
	rt.display();
	
	System.out.println(rt.display1(17, 21));
	System.out.println(rt.display2(203.0, 129.0));
	System.out.println(rt.display3("Hi im niranjan"));
}
}
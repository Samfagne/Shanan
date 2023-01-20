package METHODS_OVERLOADING;

public class adder {//changing data type of aguments
	public void add(int a, int b) {
		System.out.println(a+b);
	}
public void add(double a, double b, double c) {
	System.out.println(a+b+c);
}
public static void main(String[]arg) {
	adder a= new adder();
	a.add(3, 04);
	a.add(36, 90, 400);
}
}

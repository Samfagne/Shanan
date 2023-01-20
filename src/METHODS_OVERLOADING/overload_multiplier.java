package METHODS_OVERLOADING;

public class overload_multiplier {
	public static void multiply(double a ,double b) {
		System.out.println(a*b);
	}
	
	public static void multiply(double a, double b, double c) {
		System.out.println(a*b*c);
	}
	public static void main(String[] args) {
		overload_multiplier m = new overload_multiplier();
		m.multiply(30, 6);
		m.multiply(4, 6, 7);
	}

}

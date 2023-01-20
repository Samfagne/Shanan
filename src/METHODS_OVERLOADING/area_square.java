package METHODS_OVERLOADING;

public class area_square {
	public static void area(int a, double b) {
		System.out.println(a*b);
	}
	public static void area(int a ,int b) {
		System.out.println(a*b);
		
	
	}
	public static void main(String[]arg) {
		area_square s = new area_square();
		s.area(3, 4);
		s.area(5, 0);
	}
	
	}


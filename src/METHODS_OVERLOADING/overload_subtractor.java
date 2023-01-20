package METHODS_OVERLOADING;

public class overload_subtractor {
	public void substract (int p, int q) {
		System.out.println(p-q);
	}
	public void substract (int p, int q, int r) {
		System.out.println(p-q-r);
	}
	
	public static void main(String[] args) {
		overload_subtractor s = new overload_subtractor();
		s.substract(80, 400);
		s.substract(40, 10, 90);
	}

		
	}



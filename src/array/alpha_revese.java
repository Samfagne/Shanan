package array;

public class alpha_revese {
	public static void main(String[] args) {
		char array[]= {'p','q','r','s','t'};
		System.out.println("aaray string");
		for (int i=0;i<array.length;i++)
			System.out.println(array[i]);
		System.out.println("array in reverse order:");
		for(int i=array.length-1;i>=0;i--)
			System.out.println(array[i] + "  ");
		
	}

}

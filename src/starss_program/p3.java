package starss_program;

public class p3 {
	public static void main(String[] args) {
		int star = 1;
		int space = 6;
		for(int i =0; i<=7;i++) {
			for (int j=1;j<=7;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
			star=star+1;
			space--;
		}
	}

}

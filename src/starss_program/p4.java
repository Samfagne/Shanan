package starss_program;

public class p4 { 
	public static void main(String[] args) {

		int star = 6;
		int space = 1;
		for(int i =0; i<=7;i++) {
			for (int j=1;j>=7;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
			star--;
			space=space+1;
		}
}
}


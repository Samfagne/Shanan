package starss_program;

public class p1 {
public static void main(String[] args) {
	int space=0;
	int star=7;
	for (int i=0;i<=4;i++) {
		for(int j=1;j<=space;j++) {
			System.out.print(" ");
			
		}
		for (int j=1;j<=star;j++) {
			System.out.print("*");
		}
		System.out.println();
		star= star-2;
		space++;
		
	}
}
}

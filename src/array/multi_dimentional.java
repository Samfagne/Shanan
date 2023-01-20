package array;

public class multi_dimentional {//for matrix representation
	public static void main (String[]arg) {
		int ar[][]=new int[2][2];
		ar[0][0]=10;
		ar[0][1]=20;
		ar[1][0]=40;
		ar[1][1]=90;
		System.out.println(ar[1][1]);
		System.out.println(ar[0][0]);
		//print entire matrix
		for(int i=0;i<=1;i++)//for outer loop
	for(int j=0;j<=1;j++) {
		System.out.println(ar[i][j]+" ");
	}
	System.out.println();
}
}
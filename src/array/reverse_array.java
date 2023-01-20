package array;

public class reverse_array {
public static void main(String[] args) {
	int[]array= {1,2,3,4,5};
	System.out.println("original Array:");
	for(int i=0;i<array.length;i++)
		System.out.println(array[i]+ "   ");
	
	
	System.out.println();
	//print array starting from last element
	System.out.println("orignal array print in reverse order:");
	for(int i = array.length-1;i>=0;i--)
		System.out.println(array[i] + "  ");
}
	

}

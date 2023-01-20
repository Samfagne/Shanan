package array;

public class revese_array_int {
	public static void main(String[] args) {
		int[] array = {21,22,23,24,25};
		System.out.println("print value as it is");
		for(int i=0;i<array.length;i++)
			System.out.println(array[i]+" ");
		//for reverse 
		System.out.println("print reverse order");
		for(int i=array.length-1; i>=0;i--)
			System.out.println(array[i]+" ");
		
		
		
	}

}

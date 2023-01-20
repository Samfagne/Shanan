package array;


public class revese_alpha {
	public static void main(String[] args) {
		char[] array = {'A','B','C','D','E','F'};
		System.out.println("print orignal array:");
		for(char ch=0; ch <array.length;ch++)
			System.out.println(array[ch] +"  ");
		System.out.println();
		//print array in reverse order
		System.out.println("array in reverse order:");
		for(char ch=(char) (array.length-1);ch>0;ch--)
			System.out.println(array[ch] + "  ");
		
		
		
	}

}

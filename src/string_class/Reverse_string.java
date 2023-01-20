package string_class;

public class Reverse_string {
	public static void main(String[] args) {
		String originalstr ="hello";
		String reversestr = " ";
		System.out.println("orignal string:" + originalstr);
		for(int i = 0; i<originalstr.length();i++ ) {
			reversestr = originalstr.charAt(i)+reversestr;
		}
		System.out.println("reversed string: " + reversestr);
		}
		
	}



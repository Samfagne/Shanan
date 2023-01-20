package string_class;

public class reverse_name {
	public static void main(String[] args) {
		String orignalstr = "sampada";
		String reversestr = " ";
		System.out.println("orignal string : " +orignalstr);
		for(int i = 0; i<orignalstr.length();i++) {
			reversestr = orignalstr.charAt(i)+reversestr;
			}
		System.out.println("reverse string :" + reversestr);
	}

}

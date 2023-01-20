package string_class;

public class String_methods {
public static void main(String[]arg) {
	String s1="velocity";
	String s2="VELOCITY";
	String s3="city";
	//length()
	System.out.println(s1.length());//8//toupercase()
	System.out.println(s1.toUpperCase());//VELOCITY
	//toLowercase()
	System.out.println(s2.toLowerCase());
	//velocity
	//equal()
	System.out.println(s1.equals(s2));//false equal ignorance case
	System.out.println(s1.equalsIgnoreCase(s2));
	//contains()
	System.out.println(s1.contains(s3));//true
	System.out.println(s2.contains(s3));//false
	//charAt()
	System.out.println(s1.charAt(7));//y
	//indexof()
	System.out.println(s1.indexOf('y'));//7
	//concat()
	System.out.println(s1.concat(s3));//velocitycity
	//substring()
	System.out.println(s1.substring(4));//city
	//starwith
	System.out.println(s1.startsWith("ve"));//true
	//endwith()
	System.out.println(s1.endsWith("ty"));
}

	
}



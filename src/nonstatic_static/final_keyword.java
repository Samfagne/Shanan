package nonstatic_static;

public class final_keyword {
static int a=10;
int b=20;
public static void main(String[] args) {
	//object create
	final_keyword ref = new final_keyword();
	System.out.println(ref);//it will print address of object
	//object2
	final_keyword ref1 = new final_keyword();
	System.out.println(ref1);
	
	
	
}
}

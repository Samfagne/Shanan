package collection;
import java.util.LinkedHashSet;

public class Linked_hashaset {

	public static void main(String[] args) {
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("Suresh");
		lhs.add('A');
		lhs.add(200);
		lhs.add(null);
		lhs.add(null);
		lhs.add("Suresh");
		//print all the data
		System.out.println(lhs);//order of insertion is maintained
		
	}

}

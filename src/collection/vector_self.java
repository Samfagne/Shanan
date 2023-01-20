package collection;

import java.util.Vector;

public class vector_self {
	public static void main(String[] args) {
		Vector i = new Vector<>();
		i.add(0);
		i.add("ramesh");
		i.add(null);
		i.add("ramesh");
		System.out.println(i);
		System.out.println(i.capacity());
		System.out.println(i.clone());
		
	}

}

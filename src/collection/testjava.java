package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class testjava {
	public static void main(String[] args) {
		ArrayList j= new ArrayList();
		j.add("ravi");//adding object in arraylist
		j.add("vijay");
		j.add("ashish");
		j.add('m');
		//transversing list through the itrator
		Iterator itr= j.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}

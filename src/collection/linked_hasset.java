package collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class linked_hasset {
public static void main(String[] args) {
	LinkedHashSet lhs=new LinkedHashSet();
	lhs.add("abc");
	lhs.add(100);
	lhs.add('A');
	lhs.add(null);
	//print entire data
	//System.out.println(lhs);
	
	//is empty
	System.out.println(lhs.isEmpty());
	
	//iscontain()
	System.out.println(lhs.contains(300));//false
	
	//size()
	System.out.println(lhs.size());
	
	//fetch data using 
//	Iterator itr = lhs.iterator();
//	while(itr.hasNext()) {
//		System.out.println(itr.next()); 
//		
//	}
	
	for(Object o:lhs) {
		System.out.println(o);
	}
}
}


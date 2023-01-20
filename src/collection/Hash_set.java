package collection;
import java.util.HashSet;
import java.util.Iterator;

public class Hash_set  {
public static void main(String[] args) {
	HashSet hs=new HashSet();
hs.add("sanjay");
	hs.add('A');
	hs.add(100);
	hs.add(null);
	//print entire data
	//System.out.println(hs);
	
	//is empty
	System.out.println(hs.isEmpty());
	
	//fetch  data using Iterator
//	Iterator itr = hs.iterator();
//	while(itr.hasNext()) {
//		System.out.println(itr.next());
//	}
	
	//data fetch using for each loop
	for(Object z:hs) {
		System.out.println(z);
	}
	//
}
}


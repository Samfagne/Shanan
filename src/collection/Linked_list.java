package collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linked_list {
	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add("stallin");
		ll.add(200);
		ll.add('A');
		ll.add(null);
		//print entire data
//		System.out.println(ll);
//		//size()
//		System.out.println(ll.size());
//		//contain()
//		System.out.println(ll.contains(300));//false
//		//chech empty
//		System.out.println(ll.isEmpty());
		//fetch using Iterator
//		Iterator itr = ll.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		
		//using listiterator
//		ListIterator litr = ll.listIterator();
//		while(litr.hasNext()) {
//			System.out.println(litr.next());	
//		}
		
		
		//fetch using for each loop
		for(Object a:ll) {
			System.out.println(a);
		}
	}
}



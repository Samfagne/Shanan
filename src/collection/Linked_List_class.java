package collection;
import java.util.LinkedList;

public class Linked_List_class {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("Velocity");
		l.add(100);
		l.add('A');
		l.add(null);
		l.add(null);
		//print all the data
		System.out.println(l);
		//size
		System.out.println(l.size());//
		//contains
		System.out.println(l.contains('A'));
		//get the data
		System.out.println(l.get(2));//A
		System.out.println(l);
		//insertion(rightshift)
		l.add(2,'Z');
		System.out.println(l);
		//left shift
		l.remove(2);
		System.out.println(l);
	
		
		
		
	}
}

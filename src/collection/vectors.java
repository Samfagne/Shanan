package collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;
public class vectors {
	public static void main(String[]arg) {
	Vector v= new Vector();
		v.add("ganesh");
		v.add(100);
		v.add('A');
		v.add(null);
		System.out.println(v);
		System.out.println(v.isEmpty());//false
		
	////size of collection
		System.out.println(v.size());//4
		//contains or not
		System.out.println(v.contains(200));//false
		//get index
		System.out.println(v.get(3));
		//iterator
		Iterator itr = v.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		//listiterator
		ListIterator litr =v.listIterator();
		while(litr.hasNext());
		System.out.println(litr.next());
	}
	private Object v;
	//emumation
	private ListIterator listiterator() {
		// TODO Auto-generated method stub
		return null;
	}


		
	}
	



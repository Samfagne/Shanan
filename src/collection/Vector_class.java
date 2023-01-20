package collection;
import java.util.Vector;

public class Vector_class {
public static void main(String[] args) {
	Vector v=new Vector();
	v.add("Ankush");
	v.add(100);
	v.add('Z');
	v.add(null);
	v.add(null);
	//check the capacity
	System.out.println(v.capacity());//10
	//print all data
	System.out.println(v);
	//size
	System.out.println(v.size());
	//isempty
	System.out.println(v.isEmpty());
	//get the particular data
	System.out.println(v.get(0));//Ankush
	//rightshift
	v.add(0,"Anky");
	System.out.println(v);
	//remove(left shift)
	v.remove(0);
	System.out.println(v);
	
	
	
}
	

}
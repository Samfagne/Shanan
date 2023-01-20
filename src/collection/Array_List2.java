package collection;
import java.util.ArrayList;

public class Array_List2 {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add("Ganesh");
	al.add(100);
	al.add('A');
	al.add(null);
	al.add(null);
	al.add("Suresh");
	al.add(null);
	al.add("Ganesh");
	
	
	//I need to print entire dat inside the collection
	System.out.println(al);
	//check the size
	System.out.println(al.size());
	//check whether it is empty
	System.out.println(al.isEmpty());//false
	//contains or not
	System.out.println(al.contains(100));//false
	//ghet the data of particular index
	System.out.println(al.get(2));
	//insertion(right shift operator)
	al.add(2,500);
	System.out.println(al.get(2));//500
	//print entire data
	System.out.println(al);//right shift operation
	//remove the data (left shift operation)
	al.remove(2);//left shift
	System.out.println(al);
	
}
	

}


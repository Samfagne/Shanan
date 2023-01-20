package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class array_list1 {
	public static void main(String[]args) {
		ArrayList al=new ArrayList();
		al.add("ganesh");
		al.add(100);
		al.add('A');
		al.add(null);//print entire data
		System.out.println(al);//get the size
		System.out.println(al.size());//empty checking
		 System.out.println(al.isEmpty());//false
		 //containing data or not//
		 System.out.println(al.contains(200));//true
		 //get data from pertiicular index
		 System.out.println(al.get(0));
		 //fetch data using itrator(universal cursor)
		 Iterator itr= al.iterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
			 //fetch the dATA USING LIST ITRATOR
			 ListIterator litr=al.listIterator();
			 //print data using for each loop
			while (litr.hasNext()) {
				System.out.println(litr.next());
			}
			 for(Object s:al) {
				 System.out.println(s);
			 }
		 }
	
		 
	}
}
	



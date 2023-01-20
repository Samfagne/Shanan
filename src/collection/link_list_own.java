package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class link_list_own {
public static void main(String[] args) {
	LinkedList gerua = new LinkedList();
	gerua.add("dil to pagal hai");
	gerua.add("karishma");
	gerua.add("dil to pagal hai");
	gerua.add("heart");
	System.out.println(gerua);
	Iterator itr = gerua.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}

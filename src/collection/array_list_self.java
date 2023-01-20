package collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class array_list_self {
	public static void main(String[] args) {
		ArrayList mob= new ArrayList();
		mob.add(100);
		mob.add("ganesh");
		mob.add('m');
		mob.add("null");
		mob.add("ganesh");
		System.out.println(mob);
		System.out.println(mob.size());
		System.out.println(mob.isEmpty());
		System.out.println(mob.contains(100));//al about value which present in program n giving
		//false n true 
		System.out.println(mob.get(0));//if u put 0 thn it will give u.
	
		}
		
		
	}



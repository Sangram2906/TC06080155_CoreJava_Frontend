package LinkedList1;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.RandomAccess;

public class LinkedListDemo { 
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add("Suraj");
		l.add("Priyanka"); 
		l.add("Aishw"
				+ "arya");
		l.add("Sayalee");
		
		ListIterator<String> itr = l.listIterator();
		while(itr.hasNext()) {
			String str = itr.next();
			if(str.equals("Mayuri")) {
				itr.set("Priyanka");
			}
			if(str.equals("Aishwarya")) {
				itr.add("Kiran");
			}
		}
		System.out.println(l);
		
//		System.out.println(l); 
//		
//		l.set(0,  "KL");
//		System.out.println(l);
//		
//		l.removeLast();
//		System.out.println(l);
//		
//		l.remove("KL");
//		System.out.println(l); 
//		
//		
//		// Persisting a state of an object is called as serialization
//		System.out.println(l instanceof Serializable);
//		System.out.println(l instanceof Cloneable);
//		System.out.println(l instanceof RandomAccess);
	}

}

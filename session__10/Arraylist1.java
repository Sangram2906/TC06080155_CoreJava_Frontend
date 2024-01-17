package session__10;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Arraylist1 {
	public static void main(String[] args) {
		/*List Interface
		 * Child of collectn interface
		 * Insertion order preserved
		 * Duplicates are allowed
		 * Index plays imp role in list
		 * 
		 *Array List
		 * Resizable array or growable array
		 * best choice of "Retrieval Operation
		 * 
		 *Linked List 
		 * underlying data structure is double LinkdeList
		 * for insertion & deletion in middle then Linkwd List is best choice
		 * for retrieval operation then LL is worst choice
		 * Duplicate is allowed
		 * Insertion is preserved
		 * Heterogeneous objects are allowed
		 * Null insertion is possible
		 * Implementation Serializable & Cloneable Interfaces but not random access*/
//	   int no = 10;
//	   Integer i = new Integer(no);
//	   
//	   int a = i.intValue();
//	   
//	   int b = 100;
//	   Integer m = b;
//	   int c = m;
		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		//l.add("ABC");
		l.add(10);
		l.add(35);
		l.add(20);
		l.add(null);
		System.out.println(l); 
		
		l.add(2, 35);
		System.out.println(l);
		
		l.add(3, 24);
		System.out.println(l);
		
		System.out.println(l.contains(100));
		
		List l1 = Collections.synchronizedList(l);
	   
	}

}

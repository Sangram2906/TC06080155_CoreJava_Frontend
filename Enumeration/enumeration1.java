package Enumeration;

import java.util.Enumeration;
import java.util.Vector;

public class enumeration1 { 
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		System.out.println(v.capacity());
		for(int i = 1; i<=11; i++) {
			v.addElement(i);
		}
		System.out.println("Size = "+v.size());
		Enumeration<Integer> e = v.elements();
		while(e.hasMoreElements()) {
			int i = e.nextElement();
					if (i%2==0)
					{
						System.out.println(i);
					} 
		}
	}

}

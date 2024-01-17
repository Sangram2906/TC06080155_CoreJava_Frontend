package LinkedList1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException; 
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class test { 
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream fos = new FileOutputStream("d://abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Student s =  new Student(1, "Someone", 100.34f);
		oos.writeObject(s);
		System.out.println("Success");
		
		oos.close();
		fos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d://abc.txt"));
		Student d = (Student)ois.readObject();
		System.out.println(d); 
	} 

}

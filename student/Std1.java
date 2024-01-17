package student;
import stdd.Studen;
import java.util.Scanner;
public class Std1 {
	public int id;
	public String name;
	float marks;
	public static void main(String args[]) {
		//Studen sd = new Studen(); 
		stdd.Studen sd=new stdd.Studen();
//		sd.id=101;
//		sd.name="SR";
		//Scanner sc = new Scanner(System.in);
		
	/*	System.out.println("Enter the id :- ");
		sd.id=sc.nextInt();
		System.out.println("Enter your name:- ");
		sd.name=sc.next();
		System.out.println(sd.id+" "+sd.name+" ");
		*/
		
		/*sd.setId(192);
		sd.setName("SR");
		sd.setMarks(43);
		System.out.println(sd.getId()+"\n"+sd.getName()+"\n"+sd.getMarks());*/
		sd.getData();
		sd.dispData();
		sd.result();
	}
}

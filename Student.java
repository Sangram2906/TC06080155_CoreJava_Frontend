
public class Student {
	private int rollNo;
	private String name;
	private static int cnt;
	
	public Student() {
	}
	
	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name=name;
		cnt++;
	}
	public static int getCnt() {
		return cnt;
	}
	
	public String toString() {
		return "Student = [ rollNo"+ rollNo +", Name = "+name+"]"; 
	}
	
	static {
		System.out.println("Static Block");
		cnt = 50;
	}
	
	public static void main(String[] args) {
		System.out.println("Main Method");
		Student s1 = new Student(1, "Shivam");
		Student s2 = new Student(2, "Sangram");
		Student s3 = new Student(3, "Rishi");
		System.out.println("Total Count = " + Student.getCnt());
	}
	
}

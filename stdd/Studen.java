package stdd;

public class Studen {
		private int id;
		private String name;
		private float marks;
	/*	public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public float getMarks() {
			return marks;
		}
		public void setMarks(float marks) {
			this.marks = marks;
		}
*/
		public void getData() {
			id=100;
			name="Sangram";
			marks=51;
		}
		
		public void dispData() {
			System.out.println(id+" "+name+" "+marks);
		}
		public void result() {
			if (marks>=35) {
				System.out.println("Pass");
			}
			else {
				System.out.println("Fail");
			}
		}
	}


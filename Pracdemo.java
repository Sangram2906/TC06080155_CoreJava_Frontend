
public class Pracdemo {
	public int m, int n, int y;
	
	public void initDate() {
		m=n=y=1;
	}
	
	public void setDate(int dd, int mm, int yy) {
		m = dd;
		n = mm;
		y = yy;
	}
	
	public void disDate() {
		System.out.println("["+m+"/"+n+"/"+y+"]");
	}
	
	public static void main(String[] args) {
		Pracdemo d = new Pracdemo();
		d.disDate();
		d.initDate();
		d.disDate();
		d.setDate(2, 3, 2023);
		d.disDate();
		
	}
}

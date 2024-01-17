
public class Demodate {
	private int dd, mm, yy;

	public int getDd() {
		return dd;
	}

	public void setDd(int dd) {
		this.dd = dd;
	}
	
	public static void main(String[] args) {
		Demodate d = new Demodate();
		d.setDd(17);
		int day = d.getDd();
		System.out.println("d = "+d.getDd());
		
	}
}

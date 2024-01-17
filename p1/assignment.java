package p1;

import java.util.Scanner;

public class assignment {
	private int pid;
	private double price;
	private int qaunt;
	
	public assignment(int pid, double price, int qaunt) {
		this.pid = pid;
		this.price = price;
		this.qaunt = qaunt;
	}

	public int getPid() {
		return pid;
	}

	public double getPrice() {
		return price;
	}

	public int getQaunt() {
		return qaunt;
	}

}

public class XYZ {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		assignment[] a1 = new assignment[5];
		for(int i =0; i < 5; i++) {
			int pid = sc.nextInt();
			double price = sc.nextInt();
			int quant = sc.nextInt();
			
			a1[i] = new assignment(pid, price, qaunt);
		}
		int mP = fHP(a1);
		int tAm = calAm(a1);
		sc.close();
	}
	public static mP()
}

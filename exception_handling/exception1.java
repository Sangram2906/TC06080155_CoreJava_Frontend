package exception_handling;

public class exception1 {
	public static void getMsg() {
		msg();
	}
	public static float msg() {
		return (10/0);
	} 
	public static void main(String[] args) {
		getMsg();
	}
}

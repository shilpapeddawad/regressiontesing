package polymorphism;

public class Demo4 {
	public static void abc() {
		System.out.println("0 args  static");
	}

	public static void abc(int a) {
		System.out.println("1 int  args static " + a);
	}

	public static void abc(int a, String b) {
		System.out.println("1 int and 1 String  args static " + a + b);
	}

	public static void abc(String b, int a) {
		System.out.println("1 string and 1 int  args static " + a + b);
	}

	public static void main(String[] args) {

		Demo4.abc();
		Demo4.abc(100);
		Demo4.abc(10, "selenium");
		Demo4.abc("testng", 100);

	}

}



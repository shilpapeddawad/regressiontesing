package polymorphism;

public class Demo5 {
	private static void abc() {
		System.out.println("0 args  static");
	}

	private static void abc(int a) {
		System.out.println("1 int  args static " + a);
	}

	private static void abc(int a, String b) {
		System.out.println("1 int and 1 String  args static " + a + b);
	}

	private static void abc(String b, int a) {
		System.out.println("1 string and 1 int  args static " + a + b);
	}

	public static void main(String[] args) {

		Demo5.abc();
		Demo5.abc(100);
		Demo5.abc(10, "selenium");
		Demo5.abc("testng", 100);

	}

}



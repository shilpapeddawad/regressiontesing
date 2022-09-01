package polymorphism;

public class Demo8 extends Demo7 {
	public void abc(int m,int n)
	{
		System.out.println("2 int in demo8 class");
	}

	public static void main(String[] args) {
		Demo8 obj= new Demo8();
		obj.abc();
		obj.abc(40);
		obj.abc(20, 50);
		

	}

}

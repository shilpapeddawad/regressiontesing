package polymorphism;

public class Demo6 {
	final void abc()
	{
		System.out.println("abc 0 args");
	}
	final void abc(int x,int z)
	{
		System.out.println("abc 2 intargs");
	}
	final void abc(String b)
	{
		System.out.println("abc 1 string args");
	}
	public static void main(String[] args) {
		Demo6 obj=new Demo6();
		obj.abc();
		obj.abc(20,10);
		obj.abc("polymorphism");

	}

}

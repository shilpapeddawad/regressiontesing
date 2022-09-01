package polymorphism;

public class Demo3 {
	public void Demo3()
	{
		System.out.println("demo3 in 0 args");
	}
	public void Demo3(int a)
	{
		System.out.println("demo3 in  args");
	}
	public void Demo3(String a)
	{
		System.out.println("demo3 in 1 string args");
	}
	public static void main(String[] args) {
		Demo3 obj=new Demo3();
		obj.Demo3();
		obj.Demo3(10);
		obj.Demo3("oops");

	}

}

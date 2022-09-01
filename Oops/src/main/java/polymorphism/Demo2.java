package polymorphism;

public class Demo2 {
	public void xyz()
	{
		System.out.println("xyz method is 0 args");
	}
	public void xyz(int a)
	{
		System.out.println("xyz method is int 1 args");
	}
	public void xyz(String a)
	{
		System.out.println("xyz method is 1 string args");
	}

	public static void main(String[] args) {
		Demo2 obj=new Demo2();
		obj.xyz();
		obj.xyz(10);
		obj.xyz("selenium");

	}

}

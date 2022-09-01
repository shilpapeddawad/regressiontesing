package polymorphism;

public class Demo1 {
	public void m1()
	
	{
		System.out.println("m1 method with 0 args");
	}
public void m1(int a)
	
	{
		System.out.println("m1 method with 1 int");
	}
public void m1(int x,String y)

{
	System.out.println("m1 method with 1 int,1 string");
}

	

	public static void main(String[] args) {
		
         Demo1 obj=new Demo1();
         obj.m1();
         obj.m1(100);
         obj.m1(10, "java");

	}

}

package Overloading;

public class Sample2 extends Demo2 {
	public   void abc()
	{
		System.out.println("abc method in sample2 class");
	}


	@Override
	public void xyz()
	{
		System.out.println("xyz method in sample2 class ");
	
	}
	public void lmn()
	{
		System.out.println("lmn method in sample2 class");
	}
	public static void main(String[] args) {
		Demo2 obj=new Sample2();
		obj.abc();
		obj.xyz();
		obj.pqr();
		

	}

}

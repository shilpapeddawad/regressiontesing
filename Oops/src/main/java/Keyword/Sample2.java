package Keyword;

public class Sample2 extends Demo2{
	int a=333;
	public void abc()
	{
		int a=200;
		System.out.println(this.a);
		System.out.println(super.a);
	}

	public static void main(String[] args) {
		Sample2 obj=new Sample2();
		obj.abc();

	}

}

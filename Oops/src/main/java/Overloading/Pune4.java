package Overloading;

public class Pune4 extends Sample4{
	@Override
	public void s1() {
		System.out.println("s1 method in pune4 class");
		
	}

	@Override
	public void s2() {
		System.out.println("s2 method in pune4 class");
		
	}
	public void p1()
	{
		System.out.println("p1 method in pune4 class");
	}
public static void main(String[] args) {
	Sample4 obj=new Pune4();
			obj.d1();
	obj.d2();
	obj.d3();
	obj.d4();
	obj.s1();
	obj.s2();
	
	
}
}

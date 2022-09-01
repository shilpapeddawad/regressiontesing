package Overloading;

public class Sample3 extends Demo3{
}
@Override
public void m1() {
	System.out.println("m1 metod in sample3 class");
	
}


	
	public void xyz()
	{
		System.out.println("xyz method in sample3 class");
	}
      public void abc()
      {
    	  System.out.println("abc method in sample3 class");
      }
	public static void main(String[] args) {
		Demo3 obj=new Sample3();
		obj.abc();
		obj.m1();
		obj.xyz();
		

	}
	

}

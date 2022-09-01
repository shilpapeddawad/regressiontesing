package Inhritance;

public class Demo2 extends Demo1 {
	public void s1()
	{
		System.out.println("S1  method in Demo2 class");
	}
	
	public void s2()
	{
		System.out.println("S2  method in Demo2 class");
	}
	
	public void m3()
	{
		System.out.println("M3 method in Demo1 class");
	}
	
public static void main(String[] args) {
	//we access all the methods from parent and child
		//Demo2 obj=new Demo2();
	//	obj.m1();
	//	obj.m2();
		//obj.m3();
		//obj.s1();
		//obj.s2();
	//we access all the methods from parent class
   //  Demo1 obj=new Demo1();
    //     obj.m1();
    //     obj.m2();
      //   obj.m3();
	
	//reference of parent class and object of child class
	//parent class only
	Demo1 obj=new Demo2();
	obj.m1();
	obj.m2();
	obj.m3();
	
	}

}

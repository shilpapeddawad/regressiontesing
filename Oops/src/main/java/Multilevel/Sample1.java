package Multilevel;

public class Sample1 extends Demo1 {
	public void S1()
	{
		System.out.println("s1 method in sample1 class");
	}
	public void S2()
	{
		System.out.println("s2 method in sample1 class");
	}
	public void S3()
	{
		System.out.println("s3 method in sample1 class");
	}
	public static void main(String[] args) {
		//we can access the method on parent class
	//	Demo1 obj=new Sample1();
	//	obj.D1();
	//	obj.D2();
	//	obj.D3();
		
		//we can access the method from child class
	//	Sample1 obj=new Sample1();
		//obj.D1();
	//	obj.D2();
	//	obj.D3();
	//	obj.S1();
	//	obj.S2();
		
		//we can access the method from parent class
	//	Demo1 obj =new Demo1();
	//	obj.D1();
	//	obj.D2();
	//	obj.D3();
				

	}
	

}

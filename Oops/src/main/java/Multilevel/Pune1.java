package Multilevel;

public class Pune1 extends Sample1{

	public static void p1() {
		System.out.println("P1 static method in Pune2 class");
	}

	public static void p2() {
		System.out.println("P2 static method in Pune2 class");
	}

	public void p3() {
		System.out.println("P3 method in Pune2 class");
	}
	public static void main(String[] args) {
		//all the methods from pune1,demo1,sample1 class
	//	Pune1 obj=new Pune1();
	//	obj.p1();
	//	obj.p2();
		//obj.p3();
	//	obj.S1();
	//	obj.S2();
	//	obj.S3();
	//	obj.D1();
		//obj.D2();
		//obj.D3();
		//all the method from sample1,demo1 class
		Sample1 obj1 =new Sample1();
    // 	obj1.D1();
		//obj1.D2();
	//	obj1.D3();
		//obj1.S1();
	//	obj1.S2();
		//obj1.S3();
		//we can access method from parent class
			Demo1 obj2= new Demo1();
			obj2.D1();
			obj2.D2();
			obj2.D3();
		
		
		
		

	}

}

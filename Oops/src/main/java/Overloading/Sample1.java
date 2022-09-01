package Overloading;

public class Sample1 extends Demo1 {
	public void Display()
	{
		System.out.println("display method in sample1 class");
	}
	

	public static void main(String[] args) {
	Sample1 obj=new Sample1();
			obj.Display();
	    obj.display();
	  //  Demo1 obj=new Demo1()
	    //		obj.display();
	    
	   // Demo1 obj=new Sample1();
	    	//	obj.display();
	    

	}

}

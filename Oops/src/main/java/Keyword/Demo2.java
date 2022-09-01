package Keyword;

public class Demo2 {
	int a=999;
	public void xyz()
	{
		int a=222;
		System.out.println(a);
		System.out.println(this.a);
		
	}
	  
	public static void main(String[] args) {
	Demo2 obj=new Demo2();
	obj.xyz();

	}

}

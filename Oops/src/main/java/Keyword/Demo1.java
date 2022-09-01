package Keyword;

public class Demo1 {
	
       int a=100;
    public void m1()
    {
    	int a=90;
    	System.out.println(a);
    	System.out.println(this.a);
    }
       
       
	public static void main(String[] args) {
		
          Demo1 obj=new Demo1();
          obj.m1();
	}

}

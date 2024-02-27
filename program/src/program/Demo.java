package program;




class A
{
	public void show(int a,int b)
	{
		System.out.println(" a show");
	}
}
class B extends A
{
	public void show(int a,int b)
	{
		int c=a+b;
		System.out.println(" c is" + c);
	}
	
	}



public class Demo {

	public static void main(String[] args) {
		
		B obj=new B();
		obj.show(5,6);
		
		
		

	}

	
	}



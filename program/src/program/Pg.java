package program;

public class Pg {

	int a=5;
	int b=4;
	int add()
	{
		return a+b;
	}
	int sub()
	{
		return a-b;
	}
	int mul()
	{
		return a*b;
	}
	int div()
	{
		return a/b;
	}
	public static void main(String args[])
	
	{
		Pg b=new Pg();
		System.out.println(b.add());
		System.out.println(b.sub());
		System.out.println(b.mul());
		System.out.println(b.div());
		
	}
}
	
		


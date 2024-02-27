package program;

public class Overriding1{


	public void show()
	{
		System.out.println("chandan");

	}
	public class Program extends Overriding1 
	{
		public void show()
		{
			System.out.println("venki");
		}
	}
	
	class Overriding
	{

		public static void main(String args[])
		{ 
			Program1 c=new Program1(); 
			Overriding1 v=c;
			Program1 u=(Program1)v;
			u.clone();

		}
	}
}









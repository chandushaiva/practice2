package program;

public class Calculator {
	int a = 5;
	int b = 4;

	int add() {
		return a + b;
	}
}

class Staticcalculator extends Calculator
{
	int sub()
	{
		return a-b;
	}
}
class Calc  extends Staticcalculator
{
	int mul()
	{
		return a*b;
	}
}
class Calci
{
	public static void main(String args[])
	{
		Calc obj=new Calc();
		System.out.println(obj.mul());
		System.out.println(obj.sub());
		System.out.println(obj.add());
		
	}
}





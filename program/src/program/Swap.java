package program;

public class Swap {

	public static void main(String[] args) {
		int a=5;
		int b=4;
		int temp;
		System.out.println("before swap a is " + a);
		System.out.println("before swap b is " + b);
		
		temp=a;
		a=b;
		b=temp;
		System.out.println("after swap a is " + a);
		System.out.println("after swap b is " + b);
		

	}

}

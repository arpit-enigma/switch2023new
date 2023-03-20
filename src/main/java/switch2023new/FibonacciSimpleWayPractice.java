package switch2023new;

public class FibonacciSimpleWayPractice {
	static int n0=0,	n1=1,	n2=1;
	static int count = 10;
	
	public static void main(String[] args) {
		System.out.print(n0 + " , " + n1 + " , " + n2);
		int n3=0;
		for (int i=0;i<count-3;i++)
		{
			n3=n1+n2;
			System.out.print(" , " + n3);
			n1=n2;
			n2=n3;

		}
	}
}

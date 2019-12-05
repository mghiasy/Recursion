package withoutRecursion;


public class Fibonacci {

	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		System.out.println(f.fibWithoutRecursion(5));
	}

	private int fib(int n) {
		int n1 = 0;
		int n2= 1;
		int sum= 0;
		for (int i = 2; i <n; i++) {
			sum = n1+n2;
			n1 = n2 ;
			n2 = sum;
			
		}

		return sum;
	}
}

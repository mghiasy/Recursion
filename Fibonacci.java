package withRecursion;


public class Fibonacci {

	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		System.out.println(f.fib(5));
	}

	private int fib(int n) {
		if (n == 1 || n == 0)
			return n;
		else
			return fib(n - 1) + fib(n - 2);
	}
}

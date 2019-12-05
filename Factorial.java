package withoutRecursion;

//Without recursion
public class Factorial {

	public static void main(String[] args) {
		Factorial f = new Factorial();
		System.out.println(f.factorial(5));

	}

	private int factorial(int n) {
		int factorial = 1;
		for (int i = n; i > 0; i--) {
			factorial = factorial * i;
		}
		return factorial;
	}

}

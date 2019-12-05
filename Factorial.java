package withRecursion;

//Without recursion
public class Factorial {

	public static void main(String[] args) {
		Factorial f = new Factorial();
		System.out.println(f.factorial(5));

	}

	private int factorial(int n) {
		if(n==0) return 1;
		
		else return factorial(n-1)* n;
	}

}

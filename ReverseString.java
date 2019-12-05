package recursion;

public class ReverseString {

	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		System.out.println(reverse("Hello"));
		System.out.println(reverseWithoutRecursion("Hello"));

	}

	public static String reverse(String s) {
		return reverseUtil(s,s.length()-1);
	}
	private static String reverseUtil(String s, int len) {
		if (len < 0)
			return sb.toString();
		else {
			sb.append(s.charAt(len));
			return reverseUtil(s, len - 1);
		}

	}
	public static String reverseWithoutRecursion(String s) {
		StringBuilder sb2 = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; i--) {
			sb2.append(s.charAt(i));
		}
		return sb2.toString();
	}
}

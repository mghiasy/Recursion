package recursion;

public class ReverseString {

	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		System.out.println(reverse("Hello"));
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
}

package recursion;

public class ReverseString {

	
	public static void main(String[] args) {
		System.out.println(reverse("Hello"));
	}

	public static String reverse(String s) {
		 if (s.length() == 1)
		 return s;
		 else {
		// Get the last letter and put it in first position
		 String first = s.substring(s.length() - 1);
		 return first += reverse(s.substring(0, s.length() - 1));
		 }
	}



}

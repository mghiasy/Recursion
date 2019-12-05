package recursion;

public class BinarySearchStr {
	// INVOKE BY INSTANCE OR MAKE IT STATIC
	//IS USED FOR SORTED ARRAY
	public static boolean search(String s, char c) {
		int mid = s.length() / 2;
		if (s.length() == 0)
			return false;
		if (s.charAt(mid) == c) {
			return true;
		}
		if (s.charAt(mid) > c) {
			return search(s.substring(0, mid), c);
		}
		if (s.charAt(mid) < c) {
			return search(s.substring(mid + 1), c);
		}
		return false;
	}

	public static void main(String[] args) {
		BinarySearchStr bss = new BinarySearchStr();
		System.out.println(bss.search("aeiouxyz", 'e'));
		System.out.println(bss.search("aeiouxyz", 'w'));

	}

}

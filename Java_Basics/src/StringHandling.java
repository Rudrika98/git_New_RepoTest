
public class StringHandling {

	public static void main(String args[]) {

		// Payment $100 paid

		String str = "Payment $100 paid";
		// System.out.println(str.charAt(6));
		// System.out.println("str.codePointAt(4))"+str.codePointAt(4));
		// System.out.println("str.codePointBefore(9)"+str.codePointBefore(9));
		// System.out.println("str.codePointCount(0, 4)"+str.codePointCount(0,
		// 4));
		// System.out.println("str.compareTo(\"Rudrika
		// $100\")"+str.compareTo("Rudrika $100"));

		/**** Check Palindroma ****/
		String s = "madam";
		String t = "";
		System.out.println(s.length() - 1);
		for (int i = s.length() - 1; i > 0; i++) {
			System.out.println(s.charAt(i));
			t = t + s.charAt(i);
		}
		

		if (s.equalsIgnoreCase(t)) {
			System.out.println("Palindrome");
		}
	}
}

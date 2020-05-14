import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		

		
		Scanner scan = new Scanner(System.in);
		try {

			int a = scan.nextInt();
			Double db  = scan.nextDouble();
			scan.nextLine();
			String str = scan.nextLine();

			scan.close();
			System.out.println("String: " + str);
			System.out.println("Double: " + db);
			System.out.println("Int: " + a);

		} catch (Exception e) {
			System.out.println(e);
			// System.out.println(str);
			// str = scan.nextLine();
			// System.out.println(str);

		}
	}

}

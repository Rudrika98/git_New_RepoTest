import java.util.Scanner;

public class Solution3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("================================");
		for (int i = 0; i < 3; i++) {
			String s1 = sc.next();
			//sc.useDelimiter(System.getProperty("line.separator"));
			int x = sc.nextInt();
			System.out.printf("%-1s%03d%n", s1, x);
			// Complete this line
		}
		System.out.println("================================");

	}

}

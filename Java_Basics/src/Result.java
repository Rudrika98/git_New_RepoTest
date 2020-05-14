
public class Result {

	/*
	 * Complete the 'fizzBuzz' function below.
	 *
	 * The function accepts INTEGER n as parameter.
	 */

	public static void fizzBuzz(int n) {
		int a = 0;
		int b = 0;
		int c = 0;

		if (n > 0) {

			for (int i = 1; i <= n; i++) {

				if (i % 3 == 0 && i % 5 == 0) {
					System.out.println("Fizz Buzz");
				} else {
					if (i % 3 == 0 && i % 5 != 0) {
						System.out.println("Fizz");
					} else if (i % 5 == 0 && i % 3 != 0) {
						System.out.println("Buzz");
					} else {
						System.out.println(i);
					}
				}
			}
		}

	}
}
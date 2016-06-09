
/* Jonathan Abdo 6.8.16
 * prompt user for integer from 1-10, display factorial of the number entered
 * prompt to continue
 * use a for loop, use a long data type to store factorial
 */
import java.util.Scanner;

public class Factorial {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Quick title
		System.out.println("Welcome to the Factorial Calculator!");

		boolean cont = true;
		int userInt = 0, menu = 0;
		// while the user wants to continue entering values 'cont' will be true
		while (cont) {

			//System.out.print("\nMenu\n1.For Loop\n2.Recursion\n3.Find Max Factorial\nCalculate using? (1/2/3): ");

			menu = InputCheck.getInt(sc, "\nMenu\n1.For Loop\n2.Recursion\n3.Find Max Factorial\nCalculate using? (1/2/3): ", 1, 3);
			if (menu == 1) {
				
				userInt = InputCheck.getInt(sc, "\nFor Loop Factorial\nEnter a number from 1 to 20: ", 1, 20);
				System.out.println("\nThe factorial of " + userInt + " is");
				forFactorial(userInt);

			} else if (menu == 2) {
				
				userInt = InputCheck.getInt(sc, "\nRecursion Factorial\nEnter a number from 1 to 20: ", 1, 20);
				System.out.println("\nThe factorial of " + userInt + " is");
				System.out.println(recursiveFactorial(userInt));

			} else if (menu == 3) {
				System.out.print("\nThe max 'long' factorial is: ");
				findMaxLongFactorial();
				System.out.print("And if we go one further, 21 is: " + recursiveFactorial(21));
			} else
				System.out.println("That isn't a menu option.");

			cont = InputCheck.cont(sc, "\nContinue? (y/n)");
		}

	}

	public static void findMaxLongFactorial() {

		long answer = 1;
		int maxInt = 0;
		// keeps increasing until the factorial becomes negative
		for (int i = 1; answer * i > 0; i++) {
			answer *= i;
			maxInt = i;
		}
		System.out.println(answer + " and the max int is: " + maxInt);
	}

	public static void forFactorial(int userInt) {

		long answer = 1;
		for (int i = 1; i <= userInt; i++) {
			answer *= i;
		}
		System.out.println(answer);

	}

	public static long recursiveFactorial(long current) {

		long answer;
		// stops the recursion at 1
		if (current == 1)
			return 1;

		// keeps reducing by 1, until current=1, then recursively returns and
		// multiplies each number by the next.
		answer = recursiveFactorial(current - 1) * current;
		return answer;
		// and finally returns the full factorial
	}

}


import java.util.Scanner;

// Class 3: Decisions:  if and if-else work just as in C++
public class EnterEven1 {
	public static void main(String args[]) {
		int x;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an even number:");
		x = input.nextInt();
		if (x % 2 == 0) System.out.println("Thank you!");
		else System.out.println("Wrong");
		input.close();
	}
}
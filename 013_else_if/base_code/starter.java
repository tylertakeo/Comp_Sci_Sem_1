import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner (System.in);
		System.out.println("Guess number 1-1000");
		int b = sc.nextInt();
		boolean ghost = b==726;
		boolean mummy = b>726;
		if (ghost)
		{
			System.out.println("you gussed right");
		}
		else if (mummy)
		{
			System.out.println("your number is too big");
		}
		else
		{
			System.out.println("your number is too small");
		}
	}
}

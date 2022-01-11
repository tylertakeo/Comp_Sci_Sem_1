import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		int secret = 574;
		while (true) {
			System.out.println("Guess a number 1-1000.");
			int guess = sc.nextInt();
			if (guess!=secret)
			{
				System.out.println("You guessed wrong. :(");
			}
			else if (guess==secret)
			{
				System.out.println("You guessed correct. :)");
				break;
			}
		}
	
	}
}

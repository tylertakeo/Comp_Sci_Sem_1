import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Guess number 1-1000");
		int b = sc.nextInt();
		boolean ghost = b==726;
		if (ghost)
		{
			System.out.println("you gussed right");
		}
		else
		{
			System.out.println("you guessed wrong");
		}
	}
	
}

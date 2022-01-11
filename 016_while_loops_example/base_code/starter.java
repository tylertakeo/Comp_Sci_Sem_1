import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a name.");
		String name = sc.nextLine();
		System.out.println("How many times would you like to see this name.");
		int number = sc.nextInt();
		int x = 0;
		while (true) {
		if (x==number)
			{
				break;
			}
			System.out.println(name);
			x=x+1;
		}
		
		
		
		



		
	}
}

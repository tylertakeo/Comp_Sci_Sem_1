import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner (System.in);
		System.out.println("What is your name?");
		String text = sc.nextLine();
		System.out.println("What is your age?");
		int age = sc.nextInt();
		System.out.println("What month were you born? (1-12)");
		int month =sc.nextInt();
		System.out.println("What day were you born? (1-31)");
		int day = sc.nextInt();
		System.out.println("What year were you born?");
		int year = sc.nextInt();
		System.out.println("How much is a buck fifty?");
		double money = sc.nextDouble();
		System.out.print("Your name is ");
		System.out.println(text);
		System.out.print("You are");
		System.out.println(age);
		System.out.print("Your birthday is ");
		System.out.print(month);
		System.out.print(day);
		System.out.println(year);
		System.out.print("A buck fifty is ");
		System.out.print(money);
	}
}

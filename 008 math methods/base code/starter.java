import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	Scanner sc = new Scanner (System.in);
	System.out.println("Please enter a double");
	double number1 = sc.nextDouble();
	System.out.println("Please enter another double");
	double number2 = sc.nextDouble();
	System.out.println (Math.max(number1,number2));
	System.out.println (Math.sqrt(number2));
	System.out.println (Math.pow(number1,number2));
	}
}

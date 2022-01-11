import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Is it raining today,");
		System.out.println("Enter 1 for yes");
		System.out.println("Enter 2 for no");
		int a = sc.nextInt();
		//int b = sc.nextInt();
		boolean zebra = a==1;
		if(zebra)
		{
			System.out.println("Bring an umbrella");
		}
		else
		{
		System.out.println("Bring sunscreen");
		}
	}
	
}

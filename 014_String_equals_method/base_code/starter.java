import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Would you like to become a wizard, warrior or rogue.");
		String choice = sc.nextLine();
		String wizard = new String ("wizard");
		String warrior = new String ("warrior");
		String rogue  = new String ("rogue");
		//boolean harry = 
		if ((choice).equals(wizard))
		{
			System.out.println("It looks like you have become a wizard");
		}
		else if ((choice).equals(warrior))
		{
			System.out.println("It looks like you have become a warrior");
		}
		else if ((choice).equals(rogue))
		{
			System.out.println("It looks like you have become a rogue");
		}
		else
		{
			System.out.println("It looks like you have not chosen a role");
		}
		
		
		
	}
}

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("What is your name?");
		String name = sc.nextLine();
		System.out.println("What is your title? Ex: Demon Slayer");
		String nickname = sc.nextLine();
		System.out.println("Would you like to become a wizard, warrior or rogue.");
		String choice = sc.nextLine();
		String wizard = new String ("wizard");
		String warrior = new String ("warrior");
		String rogue  = new String ("rogue");
		if ((choice).equals(wizard))
		{
			System.out.println("It looks like you have become a wizard, wow.");
		}
		else if ((choice).equals(warrior))
		{
			System.out.println("It looks like you have become a warrior, cool.");
		}
		else if ((choice).equals(rogue))
		{
			System.out.println("It looks like you have become a rogue, holy moly.");
		}
		else
		{
			System.out.println("It looks like you have not chosen a role, please choose one now");
			String chance = sc.nextLine();
			System.out.println("It looks like you have become a "+(chance)+", amazing.");

		}
		System.out.println("You have 25 skill points to spend in the following: Strength, Dexterity, Intelligence, Constitution, and Charisma. Spend them Wisely!");
		
		System.out.print("Strentgh (1-10):");
		int strength = sc.nextInt();
		boolean s = strength<10;
		if (s)
		{
		System.out.println("You have "+(25-strength)+" left to spend");
		}
		if (strength>10)
		{
			System.out.println("Your value was over 10, please enter a new input");
			strength = sc.nextInt();
			System.out.println("You have "+(25-strength)+" left to spend");
		}
	
		System.out.print("Dexterity (1-10):");
		int dexterity = sc.nextInt();
		boolean d = dexterity<10;
		if (d)
		{
		System.out.println("You have "+(25-strength-dexterity)+" left to spend");
		}
		if (dexterity>10)
		{
			System.out.println("Your value was over 10, please enter a new input");
			dexterity = sc.nextInt();
			System.out.println("You have "+(25-strength-dexterity)+" left to spend");
		}
			System.out.print("Intelligence (1-10):");
		int intelligence = sc.nextInt();
		boolean i = intelligence<10;
		if (i)
		{
		System.out.println("You have "+(25-strength-dexterity-intelligence)+" left to spend");
		}
		if (intelligence>10)
		{
			System.out.println("Your value was over 10, please enter a new input");
			intelligence = sc.nextInt();
			System.out.println("You have "+(25-strength-dexterity-intelligence)+" left to spend");
		}

		System.out.print("Constitution (1-10):");
		int constitution = sc.nextInt();
		boolean c = constitution<10;
		if (c)
		{
		System.out.println("You have "+(25-strength-dexterity-intelligence-constitution)+" left to spend");
		}
		if (constitution>10)
		{
			System.out.println("Your value was over 10, please enter a new input");
			constitution = sc.nextInt();
			System.out.println("You have "+(25-strength-dexterity-intelligence-constitution)+" left to spend");
		}
		
		System.out.print("Charisma (1-10)");
		int charisma = sc.nextInt();
		boolean cc = charisma<10;
		if (cc)
		{
		System.out.println("You have "+(25-strength-dexterity-intelligence-constitution-charisma)+" left to spend");
		}
		if (charisma>10)
		{
			System.out.println("Your value was over 10, please enter a new input");
			charisma = sc.nextInt();
			System.out.println("You have "+(25-strength-dexterity-intelligence-constitution-charisma)+" left over points");
		}
		
		System.out.println("-");
		System.out.println("You are "+(name)+", the "+(nickname)+" of CVHS.");
		System.out.println("You're a "+(choice)+" with the following stats...");
		System.out.println("Strength - "+(strength));
		System.out.println("Dexterity - "+(dexterity));
		System.out.println("Intelligence - "+(intelligence));
		System.out.println("Constitution - "+(constitution));
		System.out.println("Charisma - "+(charisma));
		System.out.println(" ");
		System.out.println("Good luck on your quest "+(name)+"!");

	}
}

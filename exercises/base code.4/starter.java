import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Input a number");
		int num = sc.nextInt();
		int ans = num-1;
		while (num > 0){
			System.out.println(num);
			num = num * ans;
			ans = ans - 1;
		}
		
	}
}

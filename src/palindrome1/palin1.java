package palindrome1;

import java.io.NotActiveException;
import java.util.Scanner;

public class palin1 {
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int t = n;
		int rev = 0;
		while(n>0)
		{
			rev = rev*10;
			rev = rev + (n%10);
			n=n/10;
		}
		if(t == rev) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
		
	}
}

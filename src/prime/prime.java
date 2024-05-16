package prime;

import java.security.PublicKey;
import java.util.Scanner;

public class prime {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		if(isPrime(n)) {
			System.out.println("prime");
		} else {
			System.out.println("not a prime");
		}
	}
	
		
		public static boolean isPrime(int n) {
			if(n<=1) {
				return false;
			}
		for(int i=2;i<n;i++) {
		if(n%i==0) {
			return false;
		}
	}
		return true;
		}
}
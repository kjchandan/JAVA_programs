package swap;

import java.util.Scanner;

public class swap {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in) ;
			
		System.out.print(" Enter a value = ");
		int a=scanner.nextInt();
		System.out.print(" Enter b value = ");
		int b=scanner.nextInt();
		
		int temp;
		
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	
	}
}

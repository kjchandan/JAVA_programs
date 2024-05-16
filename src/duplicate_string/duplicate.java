package duplicate_string;

import java.util.Scanner;

public class duplicate {
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		char[] a = input.toCharArray();
		
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}
}

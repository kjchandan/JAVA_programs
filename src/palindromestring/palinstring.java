package palindromestring;
import java.util.Scanner;

public class palinstring {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		if(isPalindrome(input)) {
			System.out.println("palindrome");
		} else {
			System.out.println("not a palindrome");
		}
	}
		
		public static boolean isPalindrome(String input) {
		String cleanString = input.replaceAll("\\s","").toLowerCase(); 
		int length = cleanString.length();
		for(int i=0;i<length/2;i++) {
			if(cleanString.charAt(i)!=cleanString.charAt(length-1-i)) {
				return false;
			}
		}
		return true;
	}

}

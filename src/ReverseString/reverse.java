package ReverseString;

import java.util.Scanner;

public class reverse {
	    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	        String original = input.nextLine();
	        String reversed = reverseString(original);
	        System.out.println("Original: " + original);
	        System.out.println("Reversed: " + reversed);
	    }

	    public static String reverseString(String input) {
	        char[] charArray = input.toCharArray();
	        int left = 0;
	        int right = charArray.length - 1;

	        while (left < right) {
	            // Swap characters at left and right indices
	            char temp = charArray[left];
	            charArray[left] = charArray[right];
	            charArray[right] = temp;

	            // Move indices towards the center
	            left++;
	            right--;
	        }

	        return new String(charArray);
	    }
}

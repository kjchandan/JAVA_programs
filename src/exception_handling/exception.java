package exception_handling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

//public class exception {
//	public static void main(String args[]) {
//		Scanner scanner = new Scanner(System.in);
//		try {
//			int result = divide(10,0);
//			System.out.println(result);
//		} catch (Exception e) {
//			System.out.println("Arithmetic error");
//		}
//		
//	}
//	
//	public static int divide (int a,int b) {
//		return a/b;
//	}
//}


public class exception{
	public static void main(String args[]) throws FileNotFoundException {
		try {
			FileReader file = new FileReader("chandan.txt");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
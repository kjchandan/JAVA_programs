package find_duplicates;

import java.util.Scanner;



public class duplicates {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

//		String[] name = new String[3];
//		
//		for(int i=0;i< 3;i++) {
//			name[i]=scanner.next();
//		}
//		
		String[] name = {"chandan","chandan","chandan1","chandan1"};
		int count = 0;
		
		for(int i=0;i<=name.length;i++) {
			for(int j=i+1;j<name.length;j++) {
				if(name[i].equals(name[j])) {
					System.out.println(name[i]);
					count++;
				}
			}
		}
	}

}

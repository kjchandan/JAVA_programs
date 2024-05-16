package Array;
import java.util.*;
class array {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);{
			int a[][][] = new int[2][2][5];
			for(int i=0;i<2;i++) {
				for(int j=0;j<2;j++) {
					for(int k=0;k<5;k++) {
						a[i][j][k]= scanner.nextInt();
					}
				}
			}
			for(int i=0;i<2;i++) {
				for(int j=0;j<2;j++) {
					for(int k=0;k<5;k++) {
						System.out.print(a[i][j][k]);
					}
					System.out.println();
				}
				System.out.println();
			}
		}
		
	}


}

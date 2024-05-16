package Sorting;

import java.util.Iterator;
import java.util.Scanner;


public class sort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i,j,temp;
		int a[]=new int[5];
		
		for(i=0;i<a.length;i++) {
			a[i] = scan.nextInt();
		}
		
		for(i=0;i<a.length;i++) {
			for(j=i+1;j<a.length;j++) {
				if(a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(i=0;i<a.length;i++) {
			System.out.print(a[i] +" ");
		}

	}

}

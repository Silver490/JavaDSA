package Lec01;

import java.util.Scanner;

public class pattern_15 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int space = 0;
		int star = n;

		while (row <= 2*n-1) {
			
			// Space
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}
			
			// Star
			int j = 1;
			while (j <= star) {
				System.out.print("* ");
				j++;
			}
			
			
			// Mirroring
			if(row < n ) {
				star--;
				space +=2;
			}
			else {
				star++;
				space -=2;
			}
			
			row++;
			System.out.println();
			
		}

	}
}

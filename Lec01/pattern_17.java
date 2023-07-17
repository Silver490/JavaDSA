package Lec01;

import java.util.Scanner;

public class pattern_17 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int space = 1;
		int star = n-4;

		while (row <= n) {

			// Star
			int j = 1;
			while (j <= star) {
				System.out.print("* ");
				j++;
			}

			// Space
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}

			// Star
			int k = 1;
			while (k <= star) {
				System.out.print("* ");
				k++;
			}

			// Mirroring
			if (row < n/2+1 ) {
				star--;
				space+=2;
			} else {
				star++;
				space-=2;
			}

			row++;
			System.out.println();

		}

	}
}

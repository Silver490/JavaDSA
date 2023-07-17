package Lec01;

import java.util.Scanner;

public class pattern_22 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int space = -1;
		int star = n;

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
			if(row==1) {
				k=2;
			}
			while (k <= star) {
				System.out.print("* ");
				k++;
			}

			row++;
			System.out.println();
			star--;
			space+=2;

		}

	}
}

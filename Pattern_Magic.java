
import java.util.Scanner;

public class Pattern_Magic {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		int n=5;
		int row = 1;
		int space = -1;
		int star = n;

		while (row <2*n) {

			// Star
			int j = 1;
			while (j <= star) {
				System.out.print("*");
				j++;
			}

			// Space
			int i = 1;
			while (i <= space) {
				System.out.print(" ");
				i++;
			}

			// Star
			int k = 1;
			if(row==1 || row==2*n-1) {
				k=2;
			}
			while (k <= star) {
				System.out.print("*");
				k++;
			}
			
			

			// Mirroring
			if (row <n ) {
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

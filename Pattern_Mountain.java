import java.util.Scanner;

public class Pattern_Mountain {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int space = 2 * n - 3;
		int star = 1;

		while (row <= n) {

			// Star
			
			int j = 1;
			while (j <= star) {
				System.out.print(j+" ");
				j++;
				
			}

			// Space
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}

			// Star
			int val=star;
			int k = 1;
			if (row == n) {
				k = 2;
			}
			while (k <= star) {
				System.out.print(val+" ");
				k++;
				val--;
			}

			row++;
			System.out.println();
			star++;
			space -= 2;

		}

	}
}


import java.util.Scanner;

public class InvertedHourGlass {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int space = 2*n-3;
		int star = 1;

		while (row <= 2*n) {

			// Star
			int val=n;
			int j = 1;
			while (j <= star) {
				System.out.print(val+" ");
				j++;
				val--;
				
			}

			// Space
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}

			// Star
			int k = 1;
			int val2=n;
			if(row==n) {
				k=2;
			}
			while (k <= star) {
				System.out.print(val2+" ");
				k++;
				val2--;
				
				
			}
			
			
			
			//Mirroring
			if(row<n) {
				star++;
				space-=2;
			}
			else {
				star--;
				space+=2;
			}
			row++;
			System.out.println();
			

		}

	}
}


import java.util.Scanner;

public class Pattern_HourGlass {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int space = 0;
		int star = 2*n+1;

		while (row <= 2*n+1) {

			// Space
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			
			//star
			int val=star/2;
			int j=1;
			while(j<=star) {
				System.out.print(val+" ");
				
				if(j<=star/2) {
					val--;
				}
				else {
					val++;
				}
				j++;
			}
			
			
			//Mirroring
			if(row<=n) {
				space+=1;
				star-=2;
			}
			else {
				space-=1;
				star+=2;
			}
			row++;
			System.out.println();
			

		}

	}
}

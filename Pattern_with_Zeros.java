import java.util.*;

public class Pattern_with_Zeros {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		
		int star = 1;

		while (row <= n) {
			int i = 1;
			int val=row;
			while (i <=star) {
				if(i==1 || i==star) {
					System.out.print(val+" ");
					
				}
				else {
					System.out.print("0 ");
				}
				i++;
				
			}

			row++;
			System.out.println();
			star++;

		}

	}
}

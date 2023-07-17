package Practice;

public class Main {
	public static void main(String[] args) {

		int n = 5;
		int row = 1;
		int star = 3;
		int space=-1;
		while (row <= n) {
			
			for (int i = 1; i <=star; i++) {
				System.out.print("* ");
			}
			
			for (int i = 1; i <= space; i++) {
				System.out.print("  ");
			}
			
			
			int k=1;
			if (row==1 || row == n) {
				k=2;
			}
			for (; k <=star; k++) {
				System.out.print("* ");
			}
			
			// mirror
			if (row<=n/2) {
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

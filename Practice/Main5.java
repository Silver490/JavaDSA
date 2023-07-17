package Practice;

public class Main5 {
	public static void main(String[] args) {

		int n = 5;
		int row = 1;
		int star = 1;
		int space=2*n-1;
		while (row <=2*n+1) {
			
			// star
			int val=n;
			for (int i = 1; i <=star; i++) {
				System.out.print(val+" ");
				val--;
			}
			
			// Space
			for (int i = 1; i <= space; i++) {
				System.out.print("  ");
			}
			
			// star
			val++;
			int k=1;
			if (row==n+1) {
				k=2;
				val++;
			}
			for (; k <=star; k++) {
				System.out.print(val+" ");
				val++;
			}
			
			// mirroring
			if (row<=n) {
				star+=1;
				space-=2;
				
			} else {
				star-=1;
				space+=2;

			}
			
			row++;
			System.out.println();
		}
	}

}

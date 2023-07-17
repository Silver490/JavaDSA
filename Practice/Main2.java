package Practice;

public class Main2 {
	public static void main(String[] args) {

		int n = 5;
		int row = 1;
		int star = 2*n+1;
		int space=0;
		while (row <=2*n+1) {
			// Space
			for (int i = 1; i <= space; i++) {
				System.out.print("  ");
			}
			
			// star
			int val=star/2;
			for (int i = 1; i <=star; i++) {
				System.out.print(val+" ");
				if (i<=star/2) {
					val--;
					
				} else {
					val++;
				}
			}
			
			// mirror
			if (row<n+1) {
				star-=2;
				space+=1;
			} else {
				star+=2;
				space-=1;
				
			}
			row++;
			System.out.println();
		}
	}

}

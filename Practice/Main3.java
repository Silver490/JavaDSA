package Practice;

public class Main3 {
	public static void main(String[] args) {

		int n = 4;
		int row = 1;
		int star = 1;
		int space=2*n-3;
		while (row <=n) {
			
			// star
			for (int i = 1; i <=star; i++) {
				System.out.print(i+" ");
			}
			
			// Space
			for (int i = 1; i <= space; i++) {
				System.out.print("  ");
			}
			
			// star
			int j=1;
			int val=row;
			if (row==n) {
			j=2;	
			val--;
			}
			for (;j <=star; j++) {
				System.out.print(val+" ");
				val--;
			}
			
			star+=1;
			space-=2;
			row++;
			System.out.println();
		}
	}

}

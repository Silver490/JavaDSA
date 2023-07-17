package Practice;

public class Pactice_3 {
	public static void main(String[] args) {

		int n = 5;
		int row = 1;
		int star = 1;
		int space=n/2;
		while (row <= n) {
			for (int i = 1; i <= space; i++) {
				System.out.print("\t");
			}
			for (int i = 1; i <=star; i++) {
				System.out.print("*\t");
			}
			
			// mirror
			if (row<=n/2) {
				star+=2;
				space--;
			} else {
				star-=2;
				space++;
				
			}
			row++;
			System.out.println();
		}
	}

}

package Practice;

public class Pactice_1 {
	public static void main(String[] args) {

		int n = 5;
		int row = 1;
		int star = n;
		int space=2*n-2;
		while (row < 2 * n) {
			
			// space
			for (int j = 1; j <=2*space; j++) {
				System.out.print(" ");
			}
			
			// star
			for (int i = 1; i <= star; i++) {
				if (row == 1 || row == 2 * n - 1) {
					System.out.print("*");
				} 
				
				else if (row % 2 != 0 && row!=1 && row!= 2* n - 1) { // odd
					if (i == 1 || i == star) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}

				else {
					System.out.print(" ");
				}
				

			}

			row++;
			space--;
			System.out.println();
		}
	}

}

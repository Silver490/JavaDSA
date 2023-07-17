package Practice;

public class Pactice_2 {
	public static void main(String[] args) {

		int n = 5;
		int row = 1;
		int star = 1;
		int val=1;
		while (row < n) {
			for (int i = 1; i <=star; i++) {
				System.out.print(val+" ");
				val++;
			}
			star++;
			row++;
			System.out.println();
		}
	}

}

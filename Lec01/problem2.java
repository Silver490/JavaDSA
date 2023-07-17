package Lec01;

import java.util.Scanner;

public class problem2 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int space = n-1;
		int star = 1;

        while(row<n){
            // Space
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}
            // Star
			int j = 1;
			while (j <= star) {
				System.out.print("* ");
				j++;
			}

            //mirroring
            if(row<=n/2){
                star+=2;
                space--;
            }
            else{
                star-=2;
                space++;
            }

            row++;
            System.out.println();
            

		}

	}
}

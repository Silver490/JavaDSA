


import java.util.Scanner;

public class Sum_of_evenOdd_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		
		int oddsum=0;
		int evensum=0;
		int pos = 1;
		while(n>0) {
			int rem=n%10; // 2635
			if(pos%2==0) {
				evensum =evensum+rem;
			}
			else {
				oddsum = oddsum+rem;
			}
			n=n/10;
			pos++;
		}
		System.out.println(oddsum);
		System.out.println(evensum);
		
	}

}

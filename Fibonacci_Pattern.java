import java.util.*;

public class Fibonacci_Pattern {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		
		int a=0;
		int b=1;
		int c=0;		
		int star = 1;

		while (row <=n) {
			int i = 1;
			
			
			while (i <=star) {
				if(row==1) {
					System.out.print("0 ");
					
				}
				else if(row==2) {
					System.out.print("1 ");
				}
				System.out.print(c+" ");
				c = a+b; 
				a=b;
				b=c;
				i++;
				
			}

			row++;
			System.out.println();
			star++;

		}

	}
}

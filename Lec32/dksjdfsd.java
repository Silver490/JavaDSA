package Lec32;

public class dksjdfsd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4985;
//		reverse
		int rev = 0;
		while (n > 0) {
			int rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		System.out.println(rev);
		function(n);
	}

	public static void function(int n) {
		// Sum of odd places digits
		int count = 1;
		int sumOdd = 0;
		while (n > 0) {
			int rem = n % 10;
			if (count % 2 != 0) {
				sumOdd += rem;
			}
			n=n/10;
			count++;
		}
		System.out.println(sumOdd);
	}

}

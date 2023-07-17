package Lec33_Prime_Sieve;
public class Prime_check {
	public static void main(String[] args) {
		int n = 7;
		System.out.println(isprime(n));
		
	}
	public static boolean isprime(int n) {
		int i=2;
		while(i*i<=n) {
			if (n%i==0) {
				return false;
			}
			i++;
		}
		return true;
	}

}

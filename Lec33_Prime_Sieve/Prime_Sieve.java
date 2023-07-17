package Lec33_Prime_Sieve;
public class Prime_Sieve {
	// Prime Sieve is used to to print prime numbers
	// time complexity is --> O(n * log(log n))
	public static void main(String[] args) {
		int n = 100;
		Printprime(n);
	}
	
	// false--> prime
	// true--> not prime
	public static void Printprime(int n) {
		
		// (n * log(log n))
		boolean [] prime=new boolean[n+1];
		prime[0]=true; // 0 is not a prime number
		prime[1]=true; // 0 is not a prime number
		
		for (int i = 2; i*i <=n; i++) {
			if (prime[i]==false) {// i is prime
				
				for (int mul = 2; i*mul <=n ; mul++) {
					prime[mul*i]=true;
				}
			}
		}
		
		for (int i = 0; i < prime.length; i++) {
			if (prime[i]==false) {
				System.out.print(i+" ");
			}
		}
	}

}

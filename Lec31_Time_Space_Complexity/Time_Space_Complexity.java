package Lec31_Time_Space_Complexity;
public class Time_Space_Complexity {
	public static void main(String[] args) {

//		long start = System.currentTimeMillis();
//		for (int i = 0; i < 1000_00; i++) {
//		}
//		long end = System.currentTimeMillis();
//		System.out.println(end - start);
		
		// O(1)
		System.out.println("hi this is intro to time and space complexity");
		System.out.println("hey");
		
		
		// O(n)
		int n=0;
		int i=0;
		while (i<n) {
			System.out.println("hey");
			i++;
		}
		
		
		// O(log(n))
		// 2^k = n
		while (i<n) {
			System.out.println("hi");
			i *=2;
		}
		
		
		// O(log(n))
		while (n>0) {
			System.out.println("hi");
			n/=2;
		}
		
		// O(n)
		while (i<=n) {
			System.out.println("hey");
			i+=2;
			i+=3;
		}
		
		// O(log(n)base6)
		
		while (i<=n) {
			System.out.println("hey");
			i*=2;
			i*=3;
		}
		
		// Log(n) base 6 
		while (i<=n) {
			System.out.println("hey");
			i/=2;
			i/=3;
		}
		int k=1000; // just for convenience sake
		// O(n/k)
		while (i<=n) {
			System.out.println("hey");
			i+=k;
		}
		
		// O(log(n)base k
		while (i<=n) {
			System.out.println("hey");
			i*=k;
		}
		
		// independent loop
		// O(N^2)
		for (i = 1; i <=n; i++) {
			for (int j = 1; j <=n; j++) {
				System.out.println("hi");
			}
		}
		
		// Sqrt(N)
		for (i = 1; i+i <=n; i++) {
			System.out.println("hi");
		}
		
		
		//dependent loop
		//O(N^4)
		for (i = 1; i <=n; i++) {
			for (int j = 1; j <=i*i; j++) {
				for ( k = 1; k <=n/2; k++) {
					System.out.println("hey");
				}
			}
		}
		
		// log(n)
		for (i = 1; i <=n; i*=2) {
			System.out.println();
		}
		
		
		// Independent loop
		// N^2(Logn)
		for (i = n/2; i <=n; i++) {
			for (int j =1; j <=n/2; j++) {
				for ( k = 1; k <=n; k*=2) {
					System.out.println("hi");
				}
			}
		}
		
		// n(logn)
		for (i = 1; i <=n; i++) {
			for (int j = 1; j <=n; j=j+i) {
				System.out.println();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

package Lec58_DP;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int[] dp = new int[n + 1];

		System.out.println(fibTD(n,dp));;
		System.out.println(fibBU(n));
	}

	public static int fib(int n) {
		if (n == 0 || n == 1) {
			return n;
		}

		int f1 = fib(n - 1);
		int f2 = fib(n - 2);

		return f1 + f2;
	}

	public static int fibTD(int n, int[] dp) { // top Down

		if (n == 0 || n == 1) {
			return n;
		}

		if (dp[n] != 0) { // DP applied
			return dp[n];
		}
		int f1 = fib(n - 1);
		int f2 = fib(n - 2);

		return dp[n] = f1 + f2; // to memorize
	}
	
	public static int fibBU(int n) { // botom up
		int[] dp = new int[n + 1];
		dp[0]=0; // already fill as default
		dp[1]=1;
		// dp[i]= dp[i-1]+dp[i-2]
		for (int i = 2; i < dp.length; i++) {
			dp[i]=dp[i-1]+dp[i-2];
			
		}
		return dp[n];
	}

}

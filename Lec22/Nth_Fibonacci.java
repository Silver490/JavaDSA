package Lec22;
public class Nth_Fibonacci {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		int n = 6; // Fibo at index 6

		System.out.println(fib(n));
	}

	public static int fib(int n) {
		if (n == 0 || n == 1) {
			return n;
		}

		int f1 = fib(n - 1);
		int f2 = fib(n - 2);
		return f1 + f2;
	}
}

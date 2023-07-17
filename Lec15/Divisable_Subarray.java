package Lec15;

import java.util.Scanner;

public class Divisable_Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}

			System.out.println(GoodSubarray(arr));
		}
		

	}

	public static long GoodSubarray(int[] arr) {
		int n = arr.length;
		long frq[] = new long[arr.length];
		long sum = 0;
		frq[0] = 1; // 1st time 0 maana hai uske liye liya hai 1
		for (int i = 0; i < n; i++) {
			sum = sum + arr[i];
			int idx = (int) (sum % n);
			if(idx<0) { // remainder is negative then add n to negative remainder to make it positive
				idx+=n;
			}
			frq[idx] = frq[idx] + 1;

		}
		
		long ans=0;
		for (int i = 0; i < frq.length; i++) {
			if (frq[i]>=2) {
				long p= frq[i];
				ans= ans+ (p*(p-1))/2;
			}
		}
		
		return ans;
	}

}

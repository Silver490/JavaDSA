package Lec18;

import java.util.Scanner;

public class Subarray_Product_Less_Than_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int [n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(numSubarrayProductLessThanK(arr, k));
	}

	// Variable Size Sliding window
	public static int numSubarrayProductLessThanK(int[] arr, int k) {
		int si = 0; // star point
		int ei = 0; // end point
		int p = 1;
		int ans = 0;
		while (ei < arr.length) {
			// 1. grow window
			p = p * arr[ei];

			// 2. shrink window
			while (p >= k && si<=ei ) { // for example 
				p = p / arr[si];
				si++;
			}

			// 3. ans calculate
			ans = ans + ei - si + 1;
			ei++;
		}
		return ans;
	}
}

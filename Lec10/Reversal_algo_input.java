package Lec10;

import java.util.Scanner;

public class Reversal_algo_input {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//int k = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {

			arr[i] = sc.nextInt();
		}

		int k = sc.nextInt();

		RotateArray(arr, k);

		// to Print array after change
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void RotateArray(int[] arr, int k) {
		// This Method is called "two-pointer" approach
		int n = arr.length;
		k = k % n;
		//
		reverse(arr, 0, n - k - 1);
		//
		reverse(arr, n - k, n - 1);
		//
		reverse(arr, 0, n - 1);
	}

	public static void reverse(int[] arr, int i, int j) {
		// This Method is called "two-pointer" approach

		while (i < j) {

			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

}

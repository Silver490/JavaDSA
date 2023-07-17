package Lec10;

import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
		int[] arr = {1,2, 3,4, 5, 6, 7 };
		int k = 3;
		
		RotateArray(arr,k);

		// to Print array after change
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void RotateArray(int[] arr, int k) {
		// This Method is called "two-pointer" approach
		int n= arr.length;
		k=k%n;
		
		while(k>0) {
			
			int temp= arr[n-1];
			for(int i= n-2; i>=0; i--) {
				arr[i+1] = arr[i];
			}
			arr[0]= temp;
			k--;
		}
	}

}

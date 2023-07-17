package Lec10;

import java.util.Scanner;

public class Min_value {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		int[] arr = { 2, 1, 3, 4, -6, 4, -3, 11, 5 };
		
		System.out.println(minValue(arr));
	}

	public static int minValue(int[] arr) {
		int mini=0;  // minimum index
		for (int i = 1; i < arr.length; i++) {
			if (arr[i]<arr[mini]) {
				mini=i;
			}
		}
		return arr[mini];
	}
}

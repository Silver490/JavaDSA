package Lec10;

import java.util.Scanner;

public class Lenear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int[] arr = { 2, 1, 3, 4, -6, 4, -3, 11, 5 };
		int item = -3;
		System.out.println(linearSearch(arr, item));
	}

	public static int linearSearch(int[] arr, int item) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == item) {
				return i;
			}
		}
		return -1;
	}
}

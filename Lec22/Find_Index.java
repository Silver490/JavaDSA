package Lec22;

import java.util.Scanner;

public class Find_Index{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = { 2, 3, 4, 2, 3, 5, 7, 3 };
		int item = 3;
		int i=0;
		System.out.println(findindex(arr,item,i)); 
	}

	public static int findindex(int[] arr, int item, int i) {

		if (i == arr.length) {
			return -1;
		}

		if (arr[i] == item) {
			return i;
		}

		return findindex(arr, item, i + 1);

	}
}

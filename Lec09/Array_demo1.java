package Lec09;

//import java.util.Scanner;

public class Array_demo1 {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//	    int n = sc.nextInt();
		int[] arr = new int[5]; // java type declaration
//		int arr []=new int [5];   // C type declaration(used in c/c++)
		System.out.println(arr);
		System.out.println(arr.length);

		// Print
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		arr[0] = 7;
		arr[1] = -17;
		arr[2] = 11;
		arr[3] = 12;
		arr[4] = 70;
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		display(arr);
	}

	public static void display(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

package Lec10;

import java.util.Scanner;

public class Lenear_Search_imput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    
	    
		int [] arr= new int [n];
		for(int i=0; i< n; i++) {
			
			arr[i]=sc.nextInt();
		}
		int m = sc.nextInt();
		
		System.out.println(linearSearch(arr, m));
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

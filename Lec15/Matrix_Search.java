package Lec15;

import java.util.Scanner;

public class Matrix_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
//		int n= sc.nextInt();// row
//		int m= sc.nextInt();// col
//		int item=sc.nextInt();
		int [] [] arr =	{{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
		int item=6;
		System.out.println(SearchMatrix(arr,31));
		
//		int [] [] arr= new int [n][m];
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[0].length; j++) {
//				arr[i][j]=sc.nextInt();
//			}
//		}
		
		
	}
	
	public static boolean SearchMatrix(int arr[] [], int item ) {
		int row=0; // Stair case method
		int col=arr[0].length-1;
		while(row<arr.length && col>=0) {
			if (arr[row][col]==item) {
				return true;
			}
			else if (arr[row][col]>item) {
				col--;
			}
			else {
				row++;
			}
			
		}
		return false;
	}

}

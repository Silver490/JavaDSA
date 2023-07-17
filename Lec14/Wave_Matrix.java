package Lec14;

import java.util.Scanner;

public class Wave_Matrix{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();// row
		int m= sc.nextInt();// col
		int [] [] arr= new int [n][m];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		
		//int [] [] arr =	{{1 ,2, 3, 4},{2, 3, 4, 5},{2 ,5, 6, 8}};
		printWave(arr);
		
		
	}
	
	public static void printWave(int [] [] arr) {
		
		for (int col = 0; col < arr[0].length; col++) {
			if (col%2==0) { // For even cols
				for (int row= 0;  row <arr.length; row++) {
					System.out.print(arr[row][col]+", ");
				}
			} 
			
			else { // for odd cols
				for (int row= arr.length-1;  row>=0; row--) {
					System.out.print(arr[row][col]+", ");
				}
			}
			
		}
		System.out.print("END");
	}
	
}

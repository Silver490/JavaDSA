package Lec14;

import java.util.Scanner;

public class Tranpose_of_Square_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc= new Scanner(System.in);
//		int n= sc.nextInt();// row
//		int m= sc.nextInt();// col
		
	    int [] [] arr ={{1 ,2, 3, 4},
			    		{6, 3, 4, 5},
			    		{7 ,5, 6, 8}, 
			    		{3 ,5, 6, 8}};
					    
	    Transpose( arr);
	    for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
	
	}
	
	public static void Transpose(int [][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr[0].length; j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
				
			}
			
		}
	}

}

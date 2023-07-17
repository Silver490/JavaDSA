package Lec11;

import java.util.Scanner;

public class Buuble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int [] arr= new int [n];
		for(int j= 0; j<arr.length;j++) {
			arr[j]=sc.nextInt();
		}
		//int [] arr = {5,3,-7,4,8,2};
		Sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
			
		}
	}
	
	// Non-Optimized
	public static void Sort(int []arr) {
		for (int turn = 1; turn < arr.length; turn++) { // n-1 times chalana hai loop
			for (int i = 0; i < arr.length-turn; i++) {
				if (arr[i]>arr[i+1]) {
					int temp = arr[i];
					arr[i]= arr[i+1];
					arr [i+1]=temp;
				}
			}
		} 
	}
	
	// Optimized 
	public static void SortOpti(int []arr) {
		for (int turn = 1; turn < arr.length; turn++) { // n-1 times chalana hai loop
			boolean flag =false;
			for (int i = 0; i < arr.length-turn; i++) {
				if (arr[i]>arr[i+1]) {
					int temp = arr[i];
					arr[i]= arr[i+1];
					arr [i+1]=temp;
					flag=true;
				}
			}
			if(flag==false) {
				break;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
			
		}
	}
}

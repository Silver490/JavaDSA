package Lec12;


import java.util.Scanner;

public class Trapping_rain_Water{

	public static void main(String[] args) {

		//int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		int[] arr = {3,0,0,2,0,4};

		int ans=Trapping_rain_Water(arr);
		
		System.out.println(ans);
		
	}

	public static int Trapping_rain_Water(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		int[] left = new int[n];
		left[0] = arr[0];
		for (int i = 1; i < n; i++) {
			left[i] = Math.max(left[i - 1] , arr[i]);
			//System.out.print(left[i]+"  ");
			
		}
		
		int[] right = new int[n];
		right[n-1] = arr[n-1];
		for (int i = n-2; i >=0; i--) {
			right[i] = Math.max(right[i + 1] , arr[i]);
			
		}
		
		int sum=0;
		for (int i = 0; i < n; i++) {
			sum = sum+ Math.min(left[i] , right[i])-arr[i];
			
		}
		return sum;
	}
}

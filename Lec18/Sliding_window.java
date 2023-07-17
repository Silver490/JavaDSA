package Lec18;

import java.util.Scanner;

public class Sliding_window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int [] arr= {2,3,14,7,11,13,18,16};
		int k=3;
		System.out.println(SubArraySum(arr,k));
	}
	
	// Fixed Size Sliding window
	public static int SubArraySum(int [] arr, int k) {
		int sum=0;
		// For 1st Window
		for (int i = 0; i < k; i++) {
			sum= sum+arr[i];
			
		}
		int ans=sum;
		for (int i = k; i < arr.length; i++) {
			sum= sum+arr[i];
			sum=sum-arr[i-k];
			ans= Math.max(sum, ans);
			
		}
		return ans;
	}
}

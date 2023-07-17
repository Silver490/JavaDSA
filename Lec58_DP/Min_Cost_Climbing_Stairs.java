package Lec58_DP;

import java.util.Arrays;

public class Min_Cost_Climbing_Stairs {

	public static void main(String[] args) {
		int [] arr= {1,100,1,1,1,100,1,1,100,1};
//		int fs=MinCost(arr,0);
//		int ss=MinCost(arr,1);
//		int dp []= new int [arr.length];
//		Arrays.fill(dp, -1);
		System.out.println(MinCostBU(arr));
	}

	public static int MinCost(int arr[],int i) {
		if (i>=arr.length) {
			return 0;
		}
		
		int fs= MinCost(arr, i+1);
		int ss= MinCost(arr, i+2);
		return arr[i]+Math.min(fs, ss);
	}
	public static int MinCostTD(int arr[],int i,int []dp) {
		if (i>=arr.length) {
			return 0;
		}
		if (dp[i]!=-1) {
			return dp[i];
		}
		int fs= MinCostTD(arr, i+1,dp);
		int ss= MinCostTD(arr, i+2,dp);
		return dp[i]=arr[i]+Math.min(fs, ss);
	}

	public static int MinCostBU(int arr[]) {
		int [] dp= new int [arr.length];
		int n=dp.length;
		dp[0]=arr[0];
		dp[1]=arr[1];
		for (int i = 2; i < dp.length; i++) {
			int fs= dp[i-1];
			int ss= dp[i-2];
			dp[i]=Math.min(fs, ss) +arr[i];
		}
		return Math.min(dp[n-1], dp[n-2]);
	}
	
}

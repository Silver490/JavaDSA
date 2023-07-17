package Lec29_Leetcode;

import java.util.*;

public class Subsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] arr ={1,2,3};
		List<Integer> list=new ArrayList<>();
		List<List<Integer>> ans=new ArrayList<>();
		printSubsets(arr,0,list,ans);
		//printSubsets2(arr,0,list,ans);
		System.out.println(ans);
	}
	
	//Method 1
	public static void printSubsets(int [] arr,int i,List<Integer> list,List<List<Integer>> ans) {
		//System.out.println(ans);
		ans.add(new ArrayList<Integer>(list));
		
		for (int j = i; j < arr.length; j++) {
			list.add(arr[j]);
			 printSubsets(arr,j+1,list,ans);
			list.remove(list.size()-1);
		}
	}
	
	
	
	
	// Method 2
	public static void printSubsets2(int [] arr,int i,String ans) {
		if (i==arr.length) {
			System.out.println(ans);
			return;
		}
		
		 printSubsets2(arr,i+1,ans);
		 printSubsets2(arr,i+1,ans+arr[i]);
		
	}
}

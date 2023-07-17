package Lec29_Leetcode;

import java.util.*;

public class Subsets_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] arr ={4,4,4,1,4};
		List<Integer> list=new ArrayList<>();
		List<List<Integer>> ans=new ArrayList<>();
		Arrays.sort(arr);
		printSubsets(arr,0,list,ans);
		//printSubsets2(arr,0,list,ans);
		System.out.println(ans);
		System.out.println(ans.size());
	}
	
	//Method 1
	public static void printSubsets(int [] arr,int i,List<Integer> list,List<List<Integer>> ans) {
		//System.out.println(ans);
		ans.add(new ArrayList<Integer>(list));
		
		for (int j = i; j < arr.length; j++) {
			if (j!=i && arr[j]==arr[j-1]) {
				continue;
			}
			list.add(arr[j]);
			 printSubsets(arr,j+1,list,ans);
			list.remove(list.size()-1);
		}
	}
}

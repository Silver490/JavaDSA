package Lec38;
import java.util.*;

public class NextGreater {
	public static void main(String[] args) {

//		Scanner scn = new Scanner(System.in);
//
//		int t = scn.nextInt();
//
//		while (t > 0) {
//			int n = scn.nextInt();
//			int[] arr = new int[n];
//
//			for (int i = 0; i < arr.length; i++)
//				arr[i] = scn.nextInt();
//
//			nextLarger(arr);
//
//			t--;
//		}
		
		int[] arr = {11 ,9, 13, 21, 20, 54, 32, 21};
		nextLarger(arr);

	}
	
	// O(N) Time complexity
	public static void nextLarger(int[] arr) {
		Stack<Integer> st=new Stack<>();
		int [] ans= new int [arr.length];
		for (int i = 0; i < arr.length; i++) {
			// making next greater
			while (!st.empty() && arr[i]>arr[st.peek()]) {
				ans[st.pop()]=arr[i];
			}
			
			// current element
			st.push(i);
		}
		
		while (!st.empty()) {
			ans[st.pop()]=-1;
		}
		for (int i = 0; i < ans.length; i++) {
			System.out.println(arr[i]+","+ans[i]);
		}
	}
}


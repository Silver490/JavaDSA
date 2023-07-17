package Lec39;

import java.util.*;

public class Histogram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		long [] arr = new long [n];
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
//		int[] arr = { 2, 3, 5, 4, 6, 1, 7 };
		System.out.println(Area(arr));
	}

	public static long Area(long [] arr) {

		long maxArea = 0;
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			while (!st.empty() && arr[i] < arr[st.peek()]) {
				int r = i;
				long h = arr[st.pop()];
				if (st.empty()) {
					maxArea = Math.max(maxArea, (r * h));
				} else {
					int l = st.peek();
					maxArea = Math.max(maxArea, ((r - l - 1) * h));
				}
			}
			st.push(i);
		}
		int r = arr.length;
		while (!st.empty()) {

			long h = arr[st.pop()];
			if (st.empty()) {
				maxArea = Math.max(maxArea, (r * h));
			} else {
				int l = st.peek();
				maxArea = Math.max(maxArea, ((r - l - 1) * h));
			}
		}
		return maxArea;

	}
}

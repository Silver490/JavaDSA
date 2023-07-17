package Lec52_Heap;

import java.util.*;

public class Merge_Rope {

	public static void main(String[] args) {
		int[] arr = { 2,2,3,3,4 };

		System.out.println(mincost(arr));
	}

	public static int mincost(int[] arr) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < arr.length; i++) {
			pq.add(arr[i]);
		}
		int ans = 0;
		while (pq.size() > 1) {
			int a = pq.poll();
			int b = pq.poll();
			ans += a + b;
			pq.add(a + b);
		}
		return ans;

	}

}

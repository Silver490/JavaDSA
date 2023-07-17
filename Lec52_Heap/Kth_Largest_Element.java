package Lec52_Heap;

import java.util.*;

public class Kth_Largest_Element {

	public static void main(String[] args) {
		int [] arr= {3,2,3,1,2,4,5,5,6};
		int k=4;
		//kthlargest();
		
		//PriorityQueue<Integer> pq= new PriorityQueue<>(); // min heap
//		PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder()); // max heap
//		pq.add(3);
//		pq.add(2);
//		pq.add(7);
//		pq.add(31);
//		pq.add(-3);
//		pq.add(11);
//		System.out.println(pq);
		System.out.println(kthlargest(arr,k));
	}

	public static int kthlargest(int [] arr, int k) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq= new PriorityQueue<>(); // min heap
		for (int i = 0; i < k; i++) {
			pq.add(arr[i]);
		}
		for (int i = k; i < arr.length; i++) {
			if (arr[i]>pq.peek()) {
				pq.poll();
				pq.add(arr[i]);
			}
			
		}
		return pq.peek();
	}

}

package Lec19;

import java.util.*;

public class ArrayList_Demo {

	public static void main(String[] args) {
		
		ArrayList<Integer> a= new ArrayList<>(); // will be formed in Heap Memory
		System.out.println(a);// Print content
		
		System.out.println(a.size()); // print Size of ArrayList
		
		// Adding Element
		a.add(10);
		a.add(20);
		a.add(30);
		System.out.println(a);
		
		// range of index
		a.add(1, -5);// Put  -5 at index 1
		a.add(0, 8);
		System.out.println(a);
		
		// remove
		System.out.println(a.remove(2));
		System.out.println(a);
		
		
		
		// set -  update the value
		a.set(1, -7);
		System.out.println(a);
		
		// Sorting
		Collections.sort(a);
		System.out.println(a);
		
		// reverse
		Collections.reverse(a);
		System.out.println(a);
		
		
		// get element
		System.out.println(a.get(2));
		
		
		//To print array without [ ]
		for (int i = 0; i < a.size(); i++) {
			System.out.print(a.get(i)+ " ");
		}
		System.out.println();
		
		
		// Enhance for loop
		int[] arr= new int[3];
		for(int v:arr) {
			System.out.print(v+" ");
		}
		
		System.out.println();
		for(int v:a) {
			System.out.print(v+" ");
		}
		
	}
	

}

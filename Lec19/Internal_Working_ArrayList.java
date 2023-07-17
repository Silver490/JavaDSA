package Lec19;

import java.util.*;

public class Internal_Working_ArrayList {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		ArrayList<Integer> a= new ArrayList<>(); // Default  is 10
		// when arrays get full it grows by 1.5x it capacity
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(1,-5);
		a.add(0, 8);
		System.out.println(a);
		
//		for (int i = 0; i < 5; i++) {
//			a.add(sc.nextInt());
//		}
//		
//		System.out.println(a);
//		for (int i = 0; i < a.size(); i++) {
//			System.out.print(a.get(i)+" ");
//		}
		
		
		
	}
	

}

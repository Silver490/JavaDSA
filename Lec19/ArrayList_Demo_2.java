package Lec19;

import java.util.*;

public class ArrayList_Demo_2 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int n= sc.nextInt();
		ArrayList<Integer> a= new ArrayList<>(); // will be formed in Heap Memory
		for (int i = 0; i < 5; i++) {
			a.add(sc.nextInt());
		}
		
		System.out.println(a);
		for (int i = 0; i < a.size(); i++) {
			System.out.print(a.get(i)+" ");
		}
		
	}
	

}

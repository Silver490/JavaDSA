package Lec41;

import java.util.Scanner;

public class Input_Client {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Input_Of_linkedList ll=new Input_Of_linkedList();
		for (int i = 0; i <5; i++) {
			ll.addlast(sc.nextInt());
		}
		System.out.println(ll.middleNode());
	}

}

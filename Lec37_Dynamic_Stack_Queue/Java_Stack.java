package Lec37_Dynamic_Stack_Queue;

import java.util.Stack;

public class Java_Stack {
	public static void main(String [] args) {
		Stack<Integer> s=new Stack<>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		System.out.println(s.peek());
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.isEmpty());
		System.out.println(s);
		
		
	} 
	

}

package Lec37_Dynamic_Stack_Queue;

import java.util.Stack;

public class Stack_Reverse {
	public static void main(String[] args) throws Exception {
		Stack<Integer> s = new Stack<>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(-2);
		System.out.println(s);
		Reverse(s);
		System.out.println(s);
	}

	public static void Reverse(Stack<Integer> s) {
		if (s.isEmpty()) {
			return;
		}

		int item = s.pop();
		Reverse(s);
		InsertDown(s, item);
	}

	public static void InsertDown(Stack<Integer> s, int i) {
		if (s.isEmpty()) {
			s.push(i);
			return;
		}

		int item = s.pop();
		InsertDown(s, i);
		s.push(item);
	}

}

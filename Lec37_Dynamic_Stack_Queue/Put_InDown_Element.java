package Lec37_Dynamic_Stack_Queue;

import java.util.Stack;

public class Put_InDown_Element {
	public static void main(String[] args) throws Exception {
		Stack<Integer> s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(-2);
		System.out.println(s);
		InsertDown(s, -11);
		System.out.println(s);
	}

	public static void InsertDown(Stack<Integer> s, int i) throws Exception {
		if (s.isEmpty() == true) {
			s.push(i);
			return;
		}

		int item = s.pop();
		InsertDown(s, i);
		s.push(item);
	}

}

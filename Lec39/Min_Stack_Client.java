package Lec39;
import java.util.*;
public class Min_Stack_Client {
	public static void main(String[] args) throws Exception {
		Min_Stack s= new Min_Stack();
		s.push(5);
		s.push(6);
		s.push(4);
		s.push(8);
		s.push(7);
		s.push(2);
		s.push(10);
		s.Display();
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.pop());
	}
}

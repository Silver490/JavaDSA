package Lec41;
public class LinkedListCycle {
	class Node {
		int val;
		Node next;

		Node(int x) {
			val = x;
			next = null;
		}
	}
	public class Solution{
		public boolean hasCycle(Node head) {
			Node slow=head;
			Node fast=head;
			while (fast!=null && fast.next!=null) {
				slow =slow.next;
				fast=fast.next.next;
				if (slow==fast) {
					return true;
				}
			}
			return false;
		}
	}

}

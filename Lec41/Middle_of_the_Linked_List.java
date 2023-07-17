package Lec41;
public class Middle_of_the_Linked_List {

	public class Node {
		int val;
		Node next;

		Node() {
		}

		Node(int val) {
			this.val = val;
		}

		Node(int val, Node next) {
			this.val = val;
			this.next = next;
		}
	}
	
	class Solution{
		public Node middleNode(Node head) {
			Node slow=head;
			Node fast=head;
			while (fast!=null && fast.next!=null) {
				slow= slow.next;
				fast=fast.next.next;
			}
			return slow;
		}
	}

}

package Lec41;

public class Input_Of_linkedList {

	private class Node {
		int val;
		Node next;
	}

	private Node head; // 1st node address yaad rakhega
	private Node tail; // last node address yaad rakhega
	private int size; // total no. of nodes

	public void addFirst(int item) {

		if (size == 0) {
			Node nn = new Node();
			nn.val = item;
			head = nn;
			tail = nn;
			size++;
		} else {
			Node nn = new Node();
			nn.val = item;
			nn.next = head;
			head = nn;
			size++;
		}
	}

	// O(1)
	public void addlast(int item) {
		if (size == 0) {
			addFirst(item);
		} else {
			Node nn = new Node();
			nn.val = item;
			tail.next = nn;
			tail = nn;
			size++;
		}
	}
	
	public int middleNode() {
		return middleNode(head).val;
		
	}
	public Node middleNode(Node head) {
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

}

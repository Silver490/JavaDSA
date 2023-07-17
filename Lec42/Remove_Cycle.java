package Lec42;
public class Remove_Cycle {
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

	private Node GetNode(int k) throws Exception { // private --> because we are setting it for our purpose
		if (k < 0 || k >= size) { // k => index
			throw new Exception("Index is inValid ");
		}
		Node temp = head;
		for (int i = 1; i <= k; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + " --> ");
			temp = temp.next;
		}
		System.out.println(".");
	}

	public void CreateCycle() throws Exception {
		Node nn = GetNode(2);
		this.tail.next = nn;
	}

	public Node hasCycle() {
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return slow;
			}
		}
		return null;

	}
	
	public void Cycleremaval1(){
		Node meet = hasCycle();
		if (meet==null) {
			return;
		}
		
		
		Node start= head;
		while (start!=null) {
			Node temp=meet;
			while (temp.next!=meet) {
				if (temp.next==start) {
					temp.next=null;
					return;
				} else {
					temp =temp.next;
				}
			}
			start=start.next;
		}
	}
	
	public void Cycleremaval2() {
		Node meet = hasCycle();
		if (meet == null) {
			return;
		}
		int count=1;
		Node temp=meet;
		while (temp.next!=meet) {
			temp =temp.next;
			count++;
		}
		Node fast=head;
		for (int i = 1; i <=count; i++) {
			fast=fast.next;
			
		}
		Node slow=head;
		while (slow.next!=fast.next) {
			slow=slow.next;
			fast=fast.next;
		} 
		fast.next=null;
	}
	
	
	public void floydcycleremoval() {
		Node meet = hasCycle();
		if (meet == null) {
			return;
		}
		Node fast=meet;
		Node slow=head;
		while (slow.next!=fast.next) {
			slow=slow.next;
			fast=fast.next;
		} 
		fast.next=null;
	}

	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Remove_Cycle rc= new Remove_Cycle();
		rc.addlast(10);
		rc.addlast(20);
		rc.addlast(30);
		rc.addlast(40);
		rc.addlast(50);
		rc.addlast(60);
		rc.display();
		rc.CreateCycle();
		rc.Cycleremaval1();
		rc.display();
		

	}
}

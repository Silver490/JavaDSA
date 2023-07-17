package Lec40_Linked_List;

public class LinkedList {

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
	
	
	public int GetFirst() throws  Exception{
		if (size==0) {
			throw new Exception("List Is empty ");
		}
		return head.val;
	}
	public int GetLast() throws  Exception{
		if (size==0) {
			throw new Exception("List Is empty ");
		}
		return tail.val;
	}
	
	public int Getatindex(int k) throws  Exception{
		if (size==0) {
			throw new Exception("List Is empty ");
		}
		return GetNode(k).val;
	}
	
	
	// O(1)
	public int removefirst() throws  Exception{
		if (size==0) {
			throw new Exception("List Is empty ");
		}
		 Node temp =head;
		 head= head.next;
		 if (size==1) {
			tail=null;
		}
		 size--;
		 temp.next=null;
		 return temp.val;
		
	}
	public int removelast() throws  Exception{
		if (size==0) {
			throw new Exception("List Is empty ");
		}
		if (size==1) {
			return removefirst();
		} else {
			Node n= GetNode(size-2);
			Node temp=tail;
			tail=n;
			tail.next=null;
			size--;
			return temp.val;
		}
			
	}
	public int removeatindex(int k) throws  Exception{
		if (size==0) {
			throw new Exception("List Is empty ");
		}
		if (k==0) {
			return removefirst();
		} 
		else if(k==size-1) {
			return removelast();
		}
		else {
			Node curr= GetNode(k);
			Node prev= GetNode(k-1);
			prev.next=curr.next;
			curr.next=null;
			
			size--;
			return curr.val;
		}
		
	}
	
	
	
	public void addatindex(int k,int item) throws  Exception{
		if (k==0) {
			addFirst(item);
		} else if(k==size-1) {
			addlast(item);
		} else {
			Node nn = new Node();
			nn.val = item;
			Node k_1th = GetNode(k-1);
			nn.next=k_1th.next;
			k_1th.next=nn;
			size++;
		}
	}
	
	private Node GetNode(int k) throws  Exception{ // private --> because we are setting it for our purpose
		if (k<0 || k>=size) { // k => index
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
}

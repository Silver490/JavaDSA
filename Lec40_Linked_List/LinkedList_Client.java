package Lec40_Linked_List;
public class LinkedList_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.addFirst(10);
		ll.addFirst(-20);
		ll.addFirst(30);
		ll.addFirst(-40);
		ll.display();
		ll.addlast(20);
		ll.addatindex(2, -8);
		ll.display();
		System.out.println(ll.GetFirst());
		System.out.println(ll.GetLast());
		System.out.println(ll.Getatindex(4));
		ll.display();
		System.out.println(ll.removeatindex(2));
		ll.display();
		System.out.println(ll.removefirst());
		ll.display();
		System.out.println(ll.removelast());
		ll.display();
	}

}

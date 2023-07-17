package Lec41;
public class Sort_List {
	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
	
	class Solution {
	    public ListNode sortList(ListNode head) {
	    	
	    	if (head==null || head.next==null ) {
				return head;
			}
	    	
	    	ListNode mid =middleListNode(head);
	    	ListNode midnext=mid.next;
	    	mid.next=null;
	    	ListNode fs=sortList(head);
	    	ListNode ss=sortList(midnext);
	    	
	    	return mergeTwoLists(fs,ss);
	        
	    }

		public ListNode middleListNode(ListNode head) {
			
			ListNode slow= head;
			ListNode fast= head;
			while (fast.next!=null&& fast.next.next!=null) {
				slow=slow.next;
				fast=fast.next.next;
			}
			
			return slow;
		}
		
		public ListNode mergeTwoLists(ListNode h1, ListNode h2) {
			ListNode dummy = new ListNode();
			ListNode temp = dummy;
			while (h1 != null && h2 != null) {
				if (h2.val<h1.val) {
					dummy.next=h2;
					dummy=dummy.next;
					h2=h2.next;
				} else {
					dummy.next=h1;
					dummy=dummy.next;
					h1=h1.next;
				}
			}
			
			if (h1!=null) {
				dummy.next=h1;
			}
			if (h2!=null) {
				dummy.next=h2;
			}
			return temp.next;
			
		}
	}
}

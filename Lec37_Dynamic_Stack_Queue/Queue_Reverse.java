package Lec37_Dynamic_Stack_Queue;

public class Queue_Reverse {
	public static void main(String [] args) throws Exception {
		Dynamic_Queue dq=new Dynamic_Queue();
		dq.EnQueue(10);
		dq.EnQueue(20);
		dq.EnQueue(30);
		dq.EnQueue(40);
		dq.EnQueue(50);
		dq.display();
		Reverse(dq);
		dq.display();
	} 
	public static void Reverse(Dynamic_Queue dq) throws Exception {
		if (dq.isEmpty()==true) {
			return;
		}
		
		int item=dq.DeQueue();
		Reverse(dq);
		dq.EnQueue(item);
	}

}

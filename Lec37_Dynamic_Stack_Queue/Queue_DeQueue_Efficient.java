package Lec37_Dynamic_Stack_Queue;
public class Queue_DeQueue_Efficient {
		private Dynamic_Stack ds =new Dynamic_Stack();
		
		public boolean isEmpty() {
			return ds.isEmpty();
		}
		public int size() {
			return ds.size();
		}
		
		public void EnQueue(int item) throws Exception {
			Dynamic_Stack hlp =new Dynamic_Stack();
			while (!ds.isEmpty()) {
				hlp.push(ds.pop());
			}
			ds.push(item);
			while (!hlp.isEmpty()) {
				ds.push(hlp.pop());
			}
			hlp.push(item);
		}
		
		
		public int DeQueue() throws Exception {
			return ds.pop();
		}
		
		
		public int getFront() throws Exception {
			return ds.peek();
		}
		
		
		
		public static void main(String [] args) throws Exception{
			Queue_DeQueue_Efficient q=new Queue_DeQueue_Efficient();
			q.EnQueue(10);
			q.EnQueue(20);
			q.EnQueue(30);
			q.EnQueue(40);
			q.EnQueue(50);
			System.out.println(q.DeQueue());
			System.out.println(q.DeQueue());
			System.out.println(q.getFront());
			q.EnQueue(60);
			q.EnQueue(70);
			System.out.println(q.DeQueue());
			System.out.println(q.getFront());
			
		}
		
		
}

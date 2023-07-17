package Lec35;

public class Queue_Client {

	public static void main(String[] args) throws Exception {
		Queue s = new Queue();
		s.EnQueue(10);
		s.EnQueue(20);
		s.EnQueue(30);
		s.EnQueue(40);
		s.EnQueue(50);
		
		System.out.println(s.GetFront());
		s.display();
		System.out.println(s.DeQueue());
		s.display();
		System.out.println(s.size());
		s.EnQueue(-9);
		s.display();
		s.EnQueue(11);
		s.display();
	}

}
